package com.paysera.sdk.wallet.entities.card;

import com.squareup.moshi.Json;

/**
 * @author Vytautas Gimbutas <v.gimbutas@evp.lt>
 */
public class CardRelation {
    @Json(name = "redirect_uri")
    protected String redirectUri;
    @Json(name = "redirect_back_uri")
    protected String redirectBackUri;

    public String getRedirectUri() {
        return redirectUri;
    }

    public void setRedirectUri(String redirectUri) {
        this.redirectUri = redirectUri;
    }

    public String getRedirectBackUri() {
        return redirectBackUri;
    }

    public void setRedirectBackUri(String redirectBackUri) {
        this.redirectBackUri = redirectBackUri;
    }
}
