package com.paysera.sdk.wallet.entities;

import com.squareup.moshi.Json;

public class AuthToken {
    private String value;
    @Json(name = "user_id")
    private Long userId;
    @Json(name = "session_id")
    private String sessionId;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }
}
