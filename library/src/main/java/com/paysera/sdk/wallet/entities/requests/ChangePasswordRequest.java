package com.paysera.sdk.wallet.entities.requests;

import com.squareup.moshi.Json;

public class ChangePasswordRequest {
    @Json(name = "old_password")
    private String oldPassword;
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getOldPassword() {
        return oldPassword;
    }

    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }
}
