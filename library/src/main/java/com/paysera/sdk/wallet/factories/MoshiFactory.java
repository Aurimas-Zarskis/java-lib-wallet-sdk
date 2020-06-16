package com.paysera.sdk.wallet.factories;

import com.paysera.sdk.wallet.moshi.adapters.*;
import com.squareup.moshi.Moshi;

public class MoshiFactory {

    private MoshiFactory() {}

    public static Moshi createMoshi() {
        return new Moshi.Builder()
            .add(NullToEmptyListAdapter.Factory)
            .add(new BigDecimalAdapter())
            .add(new MoneyAdapter())
            .add(new MoneyDecimalAdapter())
            .add(new DateAdapter())
            .add(new DateUnixTimestampSecondsAdapter())
            .add(new CredentialsValidUntilAdapter())
            .add(new LocationImagesAdapter())
            .add(new LocationWorkingHoursAdapter())
            .add(new TransferNotificationAdapter())
            .add(new ClientAdapter())
            .add(MetadataAwareResponseAdapter.Factory)
            .build();
    }
}
