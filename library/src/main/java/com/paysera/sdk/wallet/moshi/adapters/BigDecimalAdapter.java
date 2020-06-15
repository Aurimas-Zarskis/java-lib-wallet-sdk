package com.paysera.sdk.wallet.moshi.adapters;

import com.squareup.moshi.FromJson;
import com.squareup.moshi.ToJson;

import java.math.BigDecimal;

public class BigDecimalAdapter {

    @FromJson
    BigDecimal fromJson(String string) {
        return new BigDecimal(string);
    }

    @ToJson
    String toJson(BigDecimal value) {
        return value.toString();
    }
}
