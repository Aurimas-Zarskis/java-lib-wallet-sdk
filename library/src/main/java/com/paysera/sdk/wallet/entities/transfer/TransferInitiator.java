package com.paysera.sdk.wallet.entities.transfer;

import com.squareup.moshi.Json;

public class TransferInitiator {
    @Json(name = "user_id")
    private Integer userId;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
