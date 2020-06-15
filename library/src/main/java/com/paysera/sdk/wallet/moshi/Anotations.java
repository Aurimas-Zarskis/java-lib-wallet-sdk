package com.paysera.sdk.wallet.moshi;

import com.squareup.moshi.JsonQualifier;
import java.lang.annotation.Retention;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

public class Anotations {

    @Retention(RUNTIME)
    @JsonQualifier
    public @interface DateUnixTimestamp {
    }
    @Retention(RUNTIME)
    @JsonQualifier
    public @interface DateValidUntil {
    }

    @Retention(RUNTIME)
    @JsonQualifier
    public @interface MoneyDecimal {
    }
}
