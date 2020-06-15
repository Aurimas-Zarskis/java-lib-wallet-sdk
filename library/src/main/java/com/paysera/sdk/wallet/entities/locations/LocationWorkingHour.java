package com.paysera.sdk.wallet.entities.locations;

import com.squareup.moshi.Json;

public class LocationWorkingHour {
    private LocationWorkingHoursDay day;
    @Json(name = "opening_time")
    private String openingTime;
    @Json(name = "closing_time")
    private String closingTime;

    public LocationWorkingHoursDay getDay() {
        return day;
    }

    public void setDay(LocationWorkingHoursDay day) {
        this.day = day;
    }

    public String getOpeningTime() {
        return openingTime;
    }

    public void setOpeningTime(String openingTime) {
        this.openingTime = openingTime;
    }

    public String getClosingTime() {
        return closingTime;
    }

    public void setClosingTime(String closingTime) {
        this.closingTime = closingTime;
    }
}
