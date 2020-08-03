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
import java.util.ArrayList;
import java.util.List;

public class ListMoneyAdapter {

    private final RoundingMode roundingMode;

    public ListMoneyAdapter(RoundingMode roundingMode) {
        this.roundingMode = roundingMode;
    }

    public ListMoneyAdapter() {
        this.roundingMode = RoundingMode.HALF_UP;
    }

    @ToJson
    public void toJson(JsonWriter out, List<Money> moneyList) throws IOException {
        out.beginArray();
        for (Money money : moneyList) {
            out.beginObject();
            out.name("amount").value(money.getAmount().toPlainString());
            out.name("currency").value(money.getCurrencyUnit().getCode());
            out.endObject();
        }
        out.endArray();
    }

    @FromJson
    public List<Money> fromJson(JsonReader in) throws IOException {
        ArrayList<Money> outMoneyList = new ArrayList();
        in.beginArray();
        String amount = null;
        String currency = null;
        while (in.hasNext()) {
            in.beginObject();
            while (in.hasNext()) {
                String nextName = in.nextName();
                if (nextName.equals("amount")) {
                    amount = in.nextString();
                } else if (nextName.equals("currency")) {
                    currency = in.nextString();
                }
            }
            outMoneyList.add(
                Money.of(CurrencyUnit.of(currency), new BigDecimal(amount), roundingMode)
            );
            in.endObject();
        }
        in.endArray();
        return outMoneyList;
    }
}