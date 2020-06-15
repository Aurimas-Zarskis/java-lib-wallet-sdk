package com.paysera.sdk.wallet.entities.requests;

import com.squareup.moshi.Json;

public class ReserveTransactionRequest {

    @Json(name = "reservation_code")
    private String reservationCode;

    public ReserveTransactionRequest(String reservationCode) {
        this.reservationCode = reservationCode;
    }

    public String getReservationCode() {
        return reservationCode;
    }

    public void setReservationCode(String reservationCode) {
        this.reservationCode = reservationCode;
    }
}
