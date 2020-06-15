package com.paysera.sdk.wallet.entities;

import com.squareup.moshi.Json;

public class AuthTokenResponse {
    private String type;
    @Json(name = "auth_token")
    private AuthToken authToken;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public AuthToken getAuthToken() {
        return authToken;
    }

    public void setAuthToken(AuthToken authToken) {
        this.authToken = authToken;
    }
}