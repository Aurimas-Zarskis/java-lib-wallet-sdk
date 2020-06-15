package com.paysera.sdk.wallet.entities.transfer;

import com.squareup.moshi.Json;

public class TransferPayer {
    @Json(name = "account_number")
    private String accountNumber;
    private String reference;
    @Json(name = "user_id")
    private Integer userId;

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
