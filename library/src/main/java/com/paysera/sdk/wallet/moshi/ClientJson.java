package com.paysera.sdk.wallet.moshi;

import com.paysera.sdk.wallet.entities.Credentials;
import com.paysera.sdk.wallet.entities.client.ApplicationClientInfo;

public class ClientJson {
    private String type;
    private Credentials credentials;
    private ApplicationClientInfo info;

    public ClientJson() { }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Credentials getCredentials() {
        return credentials;
    }

    public void setCredentials(Credentials credentials) {
        this.credentials = credentials;
    }

    public ApplicationClientInfo getInfo() {
        return info;
    }

    public void setInfo(ApplicationClientInfo info) {
        this.info = info;
    }
}
