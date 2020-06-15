package com.paysera.sdk.wallet.entities.requests;

import com.squareup.moshi.Json;

public class ConvertCurrencyCurrencyRequest {
    @Json(name = "from_amount")
    private Integer fromAmount;
    @Json(name = "from_currency")
    private String fromCurrency;
    @Json(name = "to_amount")
    private Integer toAmount;
    @Json(name = "to_currency")
    private String toCurrency;
    @Json(name = "account_number")
    private String accountNumber;
    @Json(name = "max_from_amount")
    private Integer maxFromAmount;
    @Json(name = "min_to_amount")
    private Integer minToAmount;

    public Integer getFromAmount() {
        return fromAmount;
    }

    public void setFromAmount(Integer fromAmount) {
        this.fromAmount = fromAmount;
    }

    public String getFromCurrency() {
        return fromCurrency;
    }

    public void setFromCurrency(String fromCurrency) {
        this.fromCurrency = fromCurrency;
    }

    public Integer getToAmount() {
        return toAmount;
    }

    public void setToAmount(Integer toAmount) {
        this.toAmount = toAmount;
    }

    public String getToCurrency() {
        return toCurrency;
    }

    public void setToCurrency(String toCurrency) {
        this.toCurrency = toCurrency;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Integer getMaxFromAmount() {
        return maxFromAmount;
    }

    public void setMaxFromAmount(Integer maxFromAmount) {
        this.maxFromAmount = maxFromAmount;
    }

    public Integer getMinToAmount() {
        return minToAmount;
    }

    public void setMinToAmount(Integer minToAmount) {
        this.minToAmount = minToAmount;
    }
}
