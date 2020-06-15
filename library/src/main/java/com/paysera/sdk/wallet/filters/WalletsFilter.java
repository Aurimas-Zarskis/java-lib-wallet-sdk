package com.paysera.sdk.wallet.filters;

import com.squareup.moshi.Json;

import java.util.List;

public class WalletsFilter extends BaseFilter {
    @Json(name = "email_list")
    private List<String> emailList;
    @Json(name = "phone_list")
    private List<String> phoneList;
    @Json(name = "email_hash_list")
    private List<String> emailHashList;
    @Json(name = "phone_hash_list")
    private List<String> phoneHashList;

    public List<String> getEmailList() {
        return emailList;
    }

    public void setEmailList(List<String> emailList) {
        this.emailList = emailList;
    }

    public List<String> getPhoneList() {
        return phoneList;
    }

    public void setPhoneList(List<String> phoneList) {
        this.phoneList = phoneList;
    }

    public List<String> getEmailHashList() {
        return emailHashList;
    }

    public void setEmailHashList(List<String> emailHashList) {
        this.emailHashList = emailHashList;
    }

    public List<String> getPhoneHashList() {
        return phoneHashList;
    }

    public void setPhoneHashList(List<String> phoneHashList) {
        this.phoneHashList = phoneHashList;
    }
}
