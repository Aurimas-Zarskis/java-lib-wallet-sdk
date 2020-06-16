package com.paysera.sdk.wallet.moshi.adapters;

import com.paysera.sdk.wallet.entities.notification.TransferNotification;
import com.squareup.moshi.FromJson;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.ToJson;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TransferNotificationAdapter {

    @ToJson
    public void toJson(JsonWriter out, List<TransferNotification> value) throws IOException {
        if (value != null) {
            out.beginObject();
            for (TransferNotification item : value) {
                out.name(item.getType());
                out.beginObject();
                out.name("email").value(item.getEmail());
                out.name("locale").value(item.getLocale());
                out.endObject();
            }
            out.endObject();
        } else {
            out.nullValue();
        }
    }

    @FromJson
    public List<TransferNotification> fromJson(JsonReader in) throws IOException {
        List<TransferNotification> transferNotifications = new ArrayList<>();
        in.beginObject();
        while (in.hasNext()) {
            TransferNotification transferNotification = new TransferNotification();
            transferNotification.setType(in.nextName());
            in.beginObject();
            if (in.nextName().equals("email")) {
                transferNotification.setEmail(in.nextString());
            }
            if (in.nextName().equals("locale")) {
                transferNotification.setLocale(in.nextString());
            }
            in.endObject();
            transferNotifications.add(transferNotification);
        }
        in.endObject();
        return transferNotifications;
    }
}
