package com.paysera.sdk.wallet.entities.confirmations;

import com.squareup.moshi.Json;
import org.joda.money.Money;

import java.util.List;

public class ConfirmationTranslationParameters {

    @Json(name = "%phone%")
    private String phone;
    @Json(name = "%email%")
    private String email;
    @Json(name = "transfers_money_sums")
    private List<Money> transfersMoneySums;
    @Json(name = "beneficiary_account")
    private String beneficiaryAccount;
    @Json(name = "transfers_count")
    private Integer transfersCount;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Money> getTransfersMoneySums() {
        return transfersMoneySums;
    }

    public void setTransfersMoneySums(List<Money> transfersMoneySums) {
        this.transfersMoneySums = transfersMoneySums;
    }

    public String getBeneficiaryAccount() {
        return beneficiaryAccount;
    }

    public void setBeneficiaryAccount(String beneficiaryAccount) {
        this.beneficiaryAccount = beneficiaryAccount;
    }

    public Integer getTransfersCount() {
        return transfersCount;
    }

    public void setTransfersCount(Integer transfersCount) {
        this.transfersCount = transfersCount;
    }
}
