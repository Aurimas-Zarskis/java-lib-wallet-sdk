package com.paysera.sdk.wallet.entities;

import com.squareup.moshi.Json;

import java.util.ArrayList;
import java.util.List;

public class WalletBalance {
    @Json(name = "currency_balances")
    private List<CurrencyBalance> currencyBalances = new ArrayList<>();

    public List<CurrencyBalance> getCurrencyBalances() {
        return this.currencyBalances;
    }

    public CurrencyBalance getCurrencyBalanceByCurrency(String currency) {
        for (CurrencyBalance currencyBalance : this.currencyBalances) {
            if (currencyBalance.getMoney().getCurrencyUnit().getCurrencyCode().equals(currency)) {
                return currencyBalance;
            }
        }

        return null;
    }

    public WalletBalance addCurrencyBalance(CurrencyBalance currencyBalance) {
        this.currencyBalances.add(currencyBalance);
        return this;
    }
}
