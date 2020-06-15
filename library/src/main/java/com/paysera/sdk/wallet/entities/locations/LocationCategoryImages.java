package com.paysera.sdk.wallet.entities.locations;

import com.squareup.moshi.Json;

public class LocationCategoryImages {
    @Json(name = "active_uri")
    private String activeUri;
    @Json(name = "inactive_uri")
    private String inactiveUri;

    public String getActiveUri() {
        return activeUri;
    }

    public void setActiveUri(String activeUri) {
        this.activeUri = activeUri;
    }

    public String getInactiveUri() {
        return inactiveUri;
    }

    public void setInactiveUri(String inactiveUri) {
        this.inactiveUri = inactiveUri;
    }
}
