package com.paysera.sdk.wallet.moshi.adapters;

import com.paysera.sdk.wallet.entities.locations.LocationImages;
import com.squareup.moshi.FromJson;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.ToJson;

import java.io.IOException;

public class LocationImagesAdapter {

    @ToJson
    public void toJson(JsonWriter out, LocationImages value) throws IOException {
        out.nullValue();
    }

    @FromJson
    public LocationImages fromJson(JsonReader in) throws IOException {
        String openUri = null;
        String closedUri = null;
        in.beginObject();
        while (in.hasNext()) {
            String nextName = in.nextName();
            if (nextName.equals("pin_open")) {
                openUri = in.nextString();
            }
            if (nextName.equals("pin_closed")) {
                closedUri = in.nextString();
            }
        }
        in.endObject();

        LocationImages locationImages = new LocationImages();
        locationImages.setPinOpenUri(openUri);
        locationImages.setPinClosedUri(closedUri);
        return locationImages;
    }
}
