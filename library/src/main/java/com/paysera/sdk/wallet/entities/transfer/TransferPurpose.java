package com.paysera.sdk.wallet.entities.transfer;

import com.squareup.moshi.Json;

public class TransferPurpose {
    private String details;
    private String reference;
    @Json(name = "purpose_code")
    private String purposeCode;
    @Json(name = "details_options")
    private TransferPurposeDetailsOptions detailsOptions;

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getPurposeCode() {
        return purposeCode;
    }

    public void setPurposeCode(String purposeCode) {
        this.purposeCode = purposeCode;
    }

    public TransferPurposeDetailsOptions getDetailsOptions() {
        return detailsOptions;
    }

    public void setDetailsOptions(TransferPurposeDetailsOptions detailsOptions) {
        this.detailsOptions = detailsOptions;
    }
}
