package com.paysera.sdk.wallet.filters;

import com.squareup.moshi.Json;

public class CardFilter extends BaseFilter {
    @Json(name = "user_id")
    private Integer userId;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
