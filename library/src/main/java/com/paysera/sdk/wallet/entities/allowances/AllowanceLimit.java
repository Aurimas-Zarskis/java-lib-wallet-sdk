package com.paysera.sdk.wallet.entities.allowances;

import com.paysera.sdk.wallet.helpers.MoneyHelper;
import com.squareup.moshi.Json;
import org.joda.money.Money;

public class AllowanceLimit {

    @Json(name = "max_price")
    private Integer maxPrice;
    @Json(name = "time")
    private Long seconds;

    public Integer getMaxPrice() {
        return maxPrice;
    }

    public Long getSeconds() {
        return seconds;
    }

    public Money getMaxPrice(String currency) {
        if (maxPrice != null) {
            return MoneyHelper.createFromCents(currency, this.maxPrice);
        } else {
            return null;
        }
    }
}
