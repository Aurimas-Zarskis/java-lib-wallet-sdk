package com.paysera.sdk.wallet.entities;

import com.squareup.moshi.Json;

public class JWTTokenResponse {

    @Json(name = "access_token")
    private String accessToken;
    @Json(name = "expires_in")
    private int expiresIn;
    private String scope;

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public int getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(int expiresIn) {
        this.expiresIn = expiresIn;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }
}
