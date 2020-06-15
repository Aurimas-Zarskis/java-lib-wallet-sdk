package com.paysera.sdk.wallet.entities.requests;

import com.squareup.moshi.Json;

import java.util.ArrayList;
import java.util.List;

public class UserPhoneConfirmationParameters {
    @Json(name = "phone_link")
    private String phoneLink;
    private List<String> scopes = new ArrayList<>();

    public String getPhoneLink() {
        return phoneLink;
    }

    public void setPhoneLink(String phoneLink) {
        this.phoneLink = phoneLink;
    }

    public List<String> getScopes() {
        return scopes;
    }

    public void setScopes(List<String> scopes) {
        this.scopes = scopes;
    }
}
