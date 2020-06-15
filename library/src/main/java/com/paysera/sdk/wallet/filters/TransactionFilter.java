package com.paysera.sdk.wallet.filters;

import com.squareup.moshi.Json;

public class TransactionFilter extends BaseFilter {
    @Json(name = "project_id")
    private Integer projectId;
    @Json(name = "location_id")
    private Integer locationId;
    private String status;
    private Integer limit;
    private Integer offset;
    private Integer from;

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public Integer getLocationId() {
        return locationId;
    }

    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getFrom() {
        return from;
    }

    public void setFrom(Integer from) {
        this.from = from;
    }
}