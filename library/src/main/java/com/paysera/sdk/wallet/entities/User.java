package com.paysera.sdk.wallet.entities;

import com.squareup.moshi.Json;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class User {
    @Json(name = "display_name")
    private String displayName;
    private Integer id;
    private String email;
    private String phone;
    private UserAddress address;
    private List<Integer> wallets = new ArrayList<>();
    private UserOptions options;
    private UserIdentity identity;
    @Json(name = "identification_level")
    private String identificationLevel;
    @Json(name = "calculated_level")
    private String calculatedLevel;
    @Json(name = "dob")
    private Date dateOfBirth;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public UserAddress getAddress() {
        return address;
    }

    public void setAddress(UserAddress address) {
        this.address = address;
    }

    public List<Integer> getWallets() {
        return wallets;
    }

    public void setWallets(List<Integer> wallets) {
        this.wallets = wallets;
    }

    public UserOptions getOptions() {
        return options;
    }

    public void setOptions(UserOptions options) {
        this.options = options;
    }

    public UserIdentity getIdentity() {
        return identity;
    }

    public void setIdentity(UserIdentity identity) {
        this.identity = identity;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getIdentificationLevel() {
        return identificationLevel;
    }

    public void setIdentificationLevel(String identificationLevel) {
        this.identificationLevel = identificationLevel;
    }

    public String getCalculatedLevel() {
        return calculatedLevel;
    }

    public void setCalculatedLevel(String calculatedLevel) {
        this.calculatedLevel = calculatedLevel;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }
}
