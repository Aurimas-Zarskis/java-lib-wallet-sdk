package com.paysera.sdk.wallet.moshi.adapters;

import com.paysera.sdk.wallet.moshi.Anotations.DateValidUntil;
import com.squareup.moshi.FromJson;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.ToJson;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

public class CredentialsValidUntilAdapter{

    @ToJson
    public void toJson(JsonWriter out, @DateValidUntil Date value) throws IOException { }

    @DateValidUntil
    @FromJson
    public Date fromJson(JsonReader in) throws IOException {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.add(Calendar.SECOND, in.nextInt());
        return calendar.getTime();
    }
}
