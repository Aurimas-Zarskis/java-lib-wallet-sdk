package com.paysera.sdk.wallet.entities.locations;
import com.squareup.moshi.Json;

public class LocationImages {
    @Json(name = "pin_open")
    private String pinOpenUri;
    @Json(name = "pin_closed")
    private String pinClosedUri;

    public String getPinOpenUri() {
        return pinOpenUri;
    }

    public void setPinOpenUri(String pinOpenUri) {
        this.pinOpenUri = pinOpenUri;
    }

    public String getPinClosedUri() {
        return pinClosedUri;
    }

    public void setPinClosedUri(String pinClosedUri) {
        this.pinClosedUri = pinClosedUri;
    }
}
