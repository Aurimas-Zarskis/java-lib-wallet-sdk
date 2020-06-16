package com.paysera.sdk.wallet.moshi.adapters;

import com.squareup.moshi.FromJson;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.ToJson;
import org.joda.money.CurrencyUnit;
import org.joda.money.Money;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class MoneyAdapter {

    private final RoundingMode roundingMode;

    public MoneyAdapter(RoundingMode roundingMode) {
        this.roundingMode = roundingMode;
    }

    public MoneyAdapter() {
        this.roundingMode = RoundingMode.HALF_UP;
    }

    @ToJson
    public void toJson(JsonWriter out, Money money) throws IOException {
        if (money != null) {
            out.beginObject();
            out.name("amount").value(money.getAmount().toPlainString());
            out.name("currency").value(money.getCurrencyUnit().getCode());
            out.endObject();
        } else {
            out.nullValue();
        }
    }

    @FromJson
    public Money fromJson(JsonReader in) throws IOException {
        String amount = null;
        String currency = null;
        in.beginObject();
        while (in.hasNext()) {
            String nextName = in.nextName();
            if (nextName.equals("amount")) {
                amount = in.nextString();
            } else if (nextName.equals("currency")) {
                currency = in.nextString();
            }
        }
        in.endObject();
        return Money.of(CurrencyUnit.of(currency), new BigDecimal(amount), roundingMode);
    }
}
