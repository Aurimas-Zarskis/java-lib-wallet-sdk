package com.paysera.sdk.wallet.entities.requests;

import com.squareup.moshi.Json;

public class UserEmailConfirmationParameters {

    @Json(name = "email_link")
    private String emailLink;

    public String getEmailLink() {
        return emailLink;
    }

    public void setEmailLink(String phoneLink) {
        this.emailLink = phoneLink;
    }

}
