package com.paysera.sdk.wallet.moshi.adapters;

import com.paysera.sdk.wallet.moshi.Anotations.DateUnixTimestamp;
import com.squareup.moshi.FromJson;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.ToJson;
import java.io.IOException;
import java.util.Date;

public class DateUnixTimestampSecondsAdapter {

    @ToJson
    public void toJson(JsonWriter out, @DateUnixTimestamp Date date) throws IOException {
        out.setSerializeNulls(false);
        if (date != null) {
            out.value(date.getTime() / 1000L);
        } else {
            out.nullValue();
        }
    }

    @FromJson
    @DateUnixTimestamp
    public Date fromJson(JsonReader reader) throws IOException {
        return new Date(reader.nextLong() * 1000);
    }
}
