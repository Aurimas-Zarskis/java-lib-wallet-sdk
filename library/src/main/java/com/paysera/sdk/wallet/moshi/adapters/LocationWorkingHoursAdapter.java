package com.paysera.sdk.wallet.moshi.adapters;

import com.paysera.sdk.wallet.entities.locations.LocationWorkingHour;
import com.paysera.sdk.wallet.entities.locations.LocationWorkingHoursDay;
import com.squareup.moshi.FromJson;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.ToJson;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LocationWorkingHoursAdapter {

    @ToJson
    public void toJson(JsonWriter out, List<LocationWorkingHour> value) throws IOException {
        out.nullValue();
    }

    @FromJson
    public List<LocationWorkingHour> fromJson(JsonReader in) throws IOException {
        List<LocationWorkingHour> workingHours = new ArrayList<>();
        in.beginObject();
            while (in.hasNext()) {
                String day = in.nextName();
                LocationWorkingHour locationWorkingHour = new LocationWorkingHour();
                locationWorkingHour.setDay(LocationWorkingHoursDay.valueOf(day));
                in.beginObject();
                String openingTime = null;
                String closingTime = null;
                while (in.hasNext()) {
                    String nextName = in.nextName();
                    if (nextName.equals("opening_time")) {
                        openingTime = in.nextString();
                    }
                    if (nextName.equals("closing_time")) {
                        closingTime = in.nextString();
                    }
                }
                in.endObject();
                locationWorkingHour.setOpeningTime(openingTime);
                locationWorkingHour.setClosingTime(closingTime);
                workingHours.add(locationWorkingHour);
            }
            in.endObject();
            return workingHours;
        }
}
