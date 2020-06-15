package com.paysera.sdk.wallet.entities.allowances;

import com.paysera.sdk.wallet.moshi.Anotations.DateUnixTimestamp;
import com.squareup.moshi.Json;

import java.util.Date;

public class AllowanceValid {

    @Json(name = "for")
    private Long validFor;
    @Json(name = "until")
    @DateUnixTimestamp
    private Date validUntil;

    public Long getValidFor() {
        return validFor;
    }

    public void setValidFor(Long validFor) {
        this.validFor = validFor;
    }

    public Date getValidUntil() {
        return validUntil;
    }

    public void setValidUntil(Date validUntil) {
        this.validUntil = validUntil;
    }
}