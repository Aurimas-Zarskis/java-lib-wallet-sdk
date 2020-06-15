package com.paysera.sdk.wallet.filters;

import com.paysera.sdk.wallet.entities.AccountInformation;
import com.paysera.sdk.wallet.entities.Wallet;
import com.paysera.sdk.wallet.entities.WalletIdentifier;
import com.squareup.moshi.Json;

public class WalletFilter {
    private String email;
    private String phone;
    @Json(name = "account_number")
    private String accountNumber;
    @Json(name = "user_id")
    private Integer userId;

    public static WalletFilter createFromWalletIdentifier(WalletIdentifier walletIdentifier) {
        WalletFilter filter = new WalletFilter();
        filter.setEmail(walletIdentifier.getEmail());
        filter.setPhone(walletIdentifier.getPhone());
        Wallet wallet = walletIdentifier.getWallet();
        if (wallet != null) {
            AccountInformation accountInformation = wallet.getAccountInformation();
            if (accountInformation != null) {
                filter.setAccountNumber(accountInformation.getAccountNumber());
            }
        }
        return filter;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
