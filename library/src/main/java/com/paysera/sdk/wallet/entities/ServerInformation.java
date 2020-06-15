package com.paysera.sdk.wallet.entities;

import com.paysera.sdk.wallet.moshi.Anotations.DateUnixTimestamp;

import java.util.Date;

public class ServerInformation {

    @DateUnixTimestamp
    private Date time;

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

}
