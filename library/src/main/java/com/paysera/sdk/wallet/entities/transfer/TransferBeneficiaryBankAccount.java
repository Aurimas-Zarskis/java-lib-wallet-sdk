package com.paysera.sdk.wallet.entities.transfer;

import com.squareup.moshi.Json;

public class TransferBeneficiaryBankAccount {
    private String iban;
    private String bic;
    @Json(name = "bank_code")
    private String bankCode;
    @Json(name = "bank_title")
    private String bankTitle;
    @Json(name = "sort_code")
    private String sortCode;
    @Json(name = "account_number")
    private String accountNumber;
    @Json(name = "country_code")
    private String countryCode;

    public String getBic() {
        return bic;
    }

    public void setBic(String bic) {
        this.bic = bic;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getBankTitle() {
        return bankTitle;
    }

    public void setBankTitle(String bankTitle) {
        this.bankTitle = bankTitle;
    }

    public String getSortCode() {
        return sortCode;
    }

    public void setSortCode(String sortCode) {
        this.sortCode = sortCode;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}
