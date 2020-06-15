package com.paysera.sdk.wallet.entities;

import com.paysera.sdk.wallet.helpers.MoneyHelper;
import com.squareup.moshi.Json;
import org.joda.money.Money;

public class CurrencyConversionCalculation {
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

    public Integer getFromAmount() {
        return fromAmount;
    }

    public Money getFromAmountMoney() {
        return MoneyHelper.createFromCents(fromCurrency, fromAmount);
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

    public Money getToAmountMoney() {
        return MoneyHelper.createFromCents(toCurrency, toAmount);
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
}
