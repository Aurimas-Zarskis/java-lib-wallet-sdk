package com.paysera.sdk.wallet.entities.transfer;


import com.squareup.moshi.Json;

public class TransferBeneficiaryPayseraAccount {
    private String phone;
    private String email;
    @Json(name = "account_number")
    private String accountNumber;
    @Json(name = "user_id")
    private Integer userId;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}
