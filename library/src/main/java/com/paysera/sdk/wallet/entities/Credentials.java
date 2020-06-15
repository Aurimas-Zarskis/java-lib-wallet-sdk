package com.paysera.sdk.wallet.entities;

import com.paysera.sdk.wallet.moshi.Anotations.DateValidUntil;
import com.squareup.moshi.Json;
import java.util.Date;

public class Credentials {
    @Json(name = "access_token")
    private String accessToken;
    @Json(name = "token_type")
    private String tokenType;
    @DateValidUntil
    @Json(name = "expires_in")
    private Date validUntil;
    @Json(name = "mac_key")
    private String macKey;
    @Json(name = "mac_algorithm")
    private String macAlgorithm;
    @Json(name = "refresh_token")
    private String refreshToken;

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getTokenType() {
        return tokenType;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    public Date getValidUntil() {
        return validUntil;
    }

    public void setValidUntil(Date validUntil) {
        this.validUntil = validUntil;
    }

    public String getMacKey() {
        return macKey;
    }

    public void setMacKey(String macKey) {
        this.macKey = macKey;
    }

    public String getMacAlgorithm() {
        return macAlgorithm;
    }

    public void setMacAlgorithm(String macAlgorithm) {
        this.macAlgorithm = macAlgorithm;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public void update(Credentials credentials) {
        this.accessToken = credentials.accessToken;
        this.tokenType = credentials.tokenType;
        this.validUntil = credentials.validUntil;
        this.macKey = credentials.macKey;
        this.macAlgorithm = credentials.macAlgorithm;
        this.refreshToken = credentials.refreshToken;
    }
}
