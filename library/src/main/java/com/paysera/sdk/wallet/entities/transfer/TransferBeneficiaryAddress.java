package com.paysera.sdk.wallet.entities.transfer;

import com.squareup.moshi.Json;

public class TransferBeneficiaryAddress {
    @Json(name = "address_line")
    private String addressLine;
    @Json(name = "country_code")
    private String countryCode;

    public String getAddressLine() {
        return addressLine;
    }

    public void setAddressLine(String addressLine) {
        this.addressLine = addressLine;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
}
