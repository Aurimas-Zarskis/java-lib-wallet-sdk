package com.paysera.sdk.wallet.moshi.adapters;

import com.paysera.sdk.wallet.entities.client.ApplicationClient;
import com.paysera.sdk.wallet.entities.client.Client;
import com.paysera.sdk.wallet.moshi.ClientJson;
import com.squareup.moshi.*;
import java.io.IOException;

public class ClientAdapter {

    @ToJson
    public void toJson(JsonWriter writer, Client client) throws IOException {
        if (client != null) {
            writer.beginObject();
            writer.name("type").value(client.getType());
            writer.endObject();
        } else {
            writer.nullValue();
        }
    }

    @FromJson
    public Client fromJson(ClientJson client) throws IOException {
        if (client.getType().equals("app_client")) {
            return new ApplicationClient(client.getCredentials(), client.getInfo());
        } else {
            throw new IllegalArgumentException("Invalid type instance passed");
        }
    }
}
