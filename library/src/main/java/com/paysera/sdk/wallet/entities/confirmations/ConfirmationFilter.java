package com.paysera.sdk.wallet.entities.confirmations;

import com.paysera.sdk.wallet.filters.BaseFilter;
import com.squareup.moshi.Json;

public class ConfirmationFilter extends BaseFilter {
    @Json(name = "order_by")
    private String orderBy;
    @Json(name = "order_direction")
    private String orderDirection;
    private String status;

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public String getOrderDirection() {
        return orderDirection;
    }

    public void setOrderDirection(String orderDirection) {
        this.orderDirection = orderDirection;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
