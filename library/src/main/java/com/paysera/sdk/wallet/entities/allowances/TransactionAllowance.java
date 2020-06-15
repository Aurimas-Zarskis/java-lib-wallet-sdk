package com.paysera.sdk.wallet.entities.allowances;

import com.squareup.moshi.Json;

public class TransactionAllowance {
    private Integer id;
    @Json(name = "data")
    private Allowance allowance;
    @Json(name = "optional")
    private Boolean isOptional;

    public Integer getId() {
        return id;
    }

    public Allowance getAllowance() {
        return allowance;
    }

    public Boolean getOptional() {
        return isOptional;
    }
}
