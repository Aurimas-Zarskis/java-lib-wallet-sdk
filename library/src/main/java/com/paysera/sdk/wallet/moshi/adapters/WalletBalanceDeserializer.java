package com.paysera.sdk.wallet.moshi.adapters;

import com.paysera.sdk.wallet.entities.CurrencyBalance;
import com.paysera.sdk.wallet.entities.WalletBalance;
import com.paysera.sdk.wallet.helpers.MoneyHelper;
import com.squareup.moshi.FromJson;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.ToJson;
import org.joda.money.Money;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Set;

public class WalletBalanceDeserializer {
//    private MoneyHelper moneyHelper;
//
//    public WalletBalanceDeserializer(MoneyHelper moneyHelper) {
//        this.moneyHelper = moneyHelper;
//    }
//
//    @FromJson
//    public WalletBalance fromJson(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
//        WalletBalance walletBalance = new WalletBalance();
//
//        Set<Map.Entry<String, JsonElement>> entries = ((JsonObject) jsonElement).entrySet();
//
//        for (Map.Entry<String, JsonElement> entry : entries) {
//            String currency = entry.getKey();
//            JsonObject balance = entry.getValue().getAsJsonObject();
//
//            Money money = moneyHelper.createFromCents(currency, balance.get("at_disposal").getAsInt());
//            Money reserved = moneyHelper.createFromCents(currency, balance.get("reserved").getAsInt());
//
//            CurrencyBalance currencyBalance = new CurrencyBalance(money, reserved);
//
//            if (balance.has("converted")) {
//                JsonObject convertedNode = balance.get("converted").getAsJsonObject();
//                currencyBalance.setAmountConverted(convertedNode.get("at_disposal").getAsInt());
//                currencyBalance.setReservedAmountConverted(convertedNode.get("reserved").getAsInt());
//            }
//            walletBalance.addCurrencyBalance(currencyBalance);
//        }
//        return walletBalance;
//    }
//
//    @ToJson
//    public void toJson(JsonWriter write, WalletBalance balance) {}
}
