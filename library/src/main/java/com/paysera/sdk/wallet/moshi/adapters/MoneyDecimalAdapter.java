package com.paysera.sdk.wallet.moshi.adapters;

import com.paysera.sdk.wallet.moshi.Anotations.MoneyDecimal;
import com.squareup.moshi.FromJson;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.ToJson;
import org.joda.money.CurrencyUnit;
import org.joda.money.Money;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class MoneyDecimalAdapter {
    private final RoundingMode roundingMode;

    public MoneyDecimalAdapter(RoundingMode roundingMode) {
        this.roundingMode = roundingMode;
    }

    public MoneyDecimalAdapter() {
        this.roundingMode = RoundingMode.HALF_UP;
    }

    @ToJson
    public void toJson(JsonWriter out, @MoneyDecimal Money money) throws IOException {
        out.beginObject();
        out.name("amount_decimal").value(money.getAmount().toPlainString());
        out.name("currency").value(money.getCurrencyUnit().getCode());
        out.endObject();
    }

    @FromJson
    @MoneyDecimal
    public Money fromJson(JsonReader in) throws IOException {
        String amount = null;
        String currency = null;

        in.skipValue();

        while (in.hasNext()) {
            if (amount != null && currency != null) {
                break;
            }

            String nextName = in.nextName();
            if (nextName.equals("amount_decimal")) {
                amount = in.nextString();
            } else if (nextName.equals("currency")) {
                currency = in.nextString();
            } else {
                in.skipValue();
            }
        }
        return Money.of(CurrencyUnit.of(currency), new BigDecimal(amount), roundingMode);
    }
}