package com.paysera.sdk.wallet.entities;

import com.squareup.moshi.Json;

public class ServerConfiguration {

    @Json(name = "minimum_password_length")
    protected int minimumPasswordLength;
    @Json(name = "bank_transfer_urgent_option_availability_beneficiary_account_regexp")
    protected String bankTransferUrgentOptionAvailabilityBeneficiaryAccountRegexp;

    public int getMinimumPasswordLength() {
        return minimumPasswordLength;
    }

    public void setMinimumPasswordLength(int minimumPasswordLength) {
        this.minimumPasswordLength = minimumPasswordLength;
    }

    public String getBankTransferUrgentOptionAvailabilityBeneficiaryAccountRegexp() {
        return bankTransferUrgentOptionAvailabilityBeneficiaryAccountRegexp;
    }

    public void setBankTransferUrgentOptionAvailabilityBeneficiaryAccountRegexp(String bankTransferUrgentOptionAvailabilityBeneficiaryAccountRegexp) {
        this.bankTransferUrgentOptionAvailabilityBeneficiaryAccountRegexp = bankTransferUrgentOptionAvailabilityBeneficiaryAccountRegexp;
    }

}
