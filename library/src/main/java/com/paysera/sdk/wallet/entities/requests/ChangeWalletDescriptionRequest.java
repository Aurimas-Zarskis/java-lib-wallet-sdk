package com.paysera.sdk.wallet.entities.requests;

import com.squareup.moshi.Json;

public class ChangeWalletDescriptionRequest {
    @Json(name = "description")
    private String walletDescription;

    public ChangeWalletDescriptionRequest(String walletDescription) {
        this.walletDescription = walletDescription;
    }

    public String getWalletDescription() {
        return walletDescription;
    }

    public void setWalletDescription(String walletDescription) {
        this.walletDescription = walletDescription;
    }
}
