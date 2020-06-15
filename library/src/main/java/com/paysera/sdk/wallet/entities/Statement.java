package com.paysera.sdk.wallet.entities;

import java.util.Date;
import com.paysera.sdk.wallet.moshi.Anotations.DateUnixTimestamp;
import com.paysera.sdk.wallet.moshi.Anotations.MoneyDecimal;
import com.squareup.moshi.Json;
import org.joda.money.Money;

public class Statement {

    private Long id;
    @MoneyDecimal
    private Money amount;
    private String details;
    private String direction;
    @DateUnixTimestamp
    private Date date;
    private String type;
    @Json(name = "transfer_id")
    private Integer transferId;
    @Json(name = "other_party")
    private OtherParty otherParty;
    @Json(name = "reference_number")
    private String referenceNumber;

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Money getAmount() {
        return amount;
    }

    public void setAmount(Money amount) {
        this.amount = amount;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getTransferId() {
        return transferId;
    }

    public void setTransferId(Integer transferId) {
        this.transferId = transferId;
    }

    public OtherParty getOtherParty() {
        return otherParty;
    }

    public void setOtherParty(OtherParty otherParty) {
        this.otherParty = otherParty;
    }
}
