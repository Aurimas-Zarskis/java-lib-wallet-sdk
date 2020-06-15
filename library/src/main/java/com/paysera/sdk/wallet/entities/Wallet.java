package com.paysera.sdk.wallet.entities;

import com.squareup.moshi.Json;

/**
 * @author Vytautas Gimbutas <v.gimbutas@evp.lt>
 */
public class Wallet {
    protected Integer id;
    @Json(name = "owner")
    protected Integer ownerId;
    @Json(name = "account")
    protected AccountInformation accountInformation;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public AccountInformation getAccountInformation() {
        return accountInformation;
    }

    public void setAccountInformation(AccountInformation accountInformation) {
        this.accountInformation = accountInformation;
    }
}
