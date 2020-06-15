package com.paysera.sdk.wallet.moshi.adapters;

import com.squareup.moshi.FromJson;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.ToJson;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateAdapter {

    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    @ToJson
    public void toJson(JsonWriter out, Date value) throws IOException {
        if (value != null) {
            out.value(dateFormat.format(value));
        }
    }

    @FromJson
    public Date fromJson(JsonReader in) throws IOException {
        String date = in.nextString();
        try {
            return dateFormat.parse(date);
        } catch (ParseException e) {
            return null;
        }
    }
}
