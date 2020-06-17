package com.paysera.sdk.wallet.moshi.adapters;

import com.paysera.sdk.wallet.entities.client.ApplicationClient;
import com.paysera.sdk.wallet.entities.client.Client;
import com.paysera.sdk.wallet.moshi.ClientJson;
import com.squareup.moshi.*;

public class ClientAdapter {

    @ToJson
    public ClientJson toJson(Client client) {
        if (client != null) {
            if (client.getType().equals("app_client")) {
                ApplicationClient appClient = (ApplicationClient) client;
                return new ClientJson(appClient.getType(), appClient.getCredentials(), appClient.getInfo());
            } else {
                throw new IllegalArgumentException("Invalid type instance passed");
            }
        } else {
            return new ClientJson();
        }
    }

    @FromJson
    public Client fromJson(ClientJson client) {
        if (client.getType().equals("app_client")) {
            return new ApplicationClient(client.getCredentials(), client.getInfo());
        } else {
            throw new IllegalArgumentException("Invalid type instance passed");
        }
    }
}
