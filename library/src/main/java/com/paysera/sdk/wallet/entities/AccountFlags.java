package com.paysera.sdk.wallet.entities;

import com.squareup.moshi.Json;

public class AccountFlags {
    private Boolean savings;
    @Json(name = "public")
    private Boolean publicFlag;

    public Boolean getSavings() {
        return savings;
    }

    public void setSavings(Boolean savings) {
        this.savings = savings;
    }

    public Boolean getPublicFlag() {
        return publicFlag;
    }

    public void setPublicFlag(Boolean publicFlag) {
        this.publicFlag = publicFlag;
    }
}
