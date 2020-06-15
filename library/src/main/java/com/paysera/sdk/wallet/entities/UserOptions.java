package com.paysera.sdk.wallet.entities;

import com.squareup.moshi.Json;

public class UserOptions {
    @Json(name = "default_currency")
    private String defaultCurrency;

    public String getDefaultCurrency() {
        return defaultCurrency;
    }

    public void setDefaultCurrency(String defaultCurrency) {
        this.defaultCurrency = defaultCurrency;
    }
}
