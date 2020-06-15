package com.paysera.sdk.wallet.normalizers;

import com.paysera.sdk.wallet.exceptions.NormalizerException;
import org.json.JSONObject;

import java.io.IOException;

public interface DenormalizerInterface<T> {
    T mapToEntity(JSONObject data) throws NormalizerException, IOException;
}
