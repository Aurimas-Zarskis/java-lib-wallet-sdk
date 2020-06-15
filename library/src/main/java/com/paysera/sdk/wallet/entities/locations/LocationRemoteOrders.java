package com.paysera.sdk.wallet.entities.locations;

import com.squareup.moshi.Json;

public class LocationRemoteOrders {
    @Json(name = "spot_id")
    private Integer spotId;

    public Integer getSpotId() {
        return spotId;
    }

    public void setSpotId(Integer spotId) {
        this.spotId = spotId;
    }
}
