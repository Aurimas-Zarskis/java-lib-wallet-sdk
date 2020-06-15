package com.paysera.sdk.wallet.moshi.adapters;

import com.paysera.sdk.wallet.entities.client.ApplicationClient;
import com.paysera.sdk.wallet.entities.client.Client;
import com.squareup.moshi.*;
import java.io.IOException;

public class ClientAdapter {

//    @Override
//    public JsonElement serialize(Client client, Type type, JsonSerializationContext context) {
//        JsonElement serializedClient = context.serialize(client);
//        serializedClient.getAsJsonObject().addProperty("type", client.getType());
//        return serializedClient;
//    }

    @ToJson
    public void toJson(JsonWriter writer, Client client) throws IOException {
        writer.beginObject();
        writer.name("type").value(client.getType());
        writer.endObject();
    }

//    @Override
//    public Client deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
//        JsonObject jsonObject = json.getAsJsonObject();
//
//        if (jsonObject.get("type").getAsString().equals("app_client")) {
//            return context.deserialize(json, ApplicationClient.class);
//        } else {
//            throw new IllegalArgumentException("Invalid type instance passed");
//        }
//    }

    @FromJson
    public Client fromJson(JsonReader reader) throws IOException {
        Moshi moshi = new Moshi.Builder().build();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("type") && reader.nextString().equals("app_client")) {
                return moshi.adapter(ApplicationClient.class).fromJson(reader);
            } else {
                throw new IllegalArgumentException("Invalid type instance passed");
            }
        }
        return null;
    }
}
