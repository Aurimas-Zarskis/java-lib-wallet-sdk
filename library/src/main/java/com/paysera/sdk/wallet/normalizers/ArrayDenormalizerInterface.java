package com.paysera.sdk.wallet.normalizers;

import com.paysera.sdk.wallet.exceptions.NormalizerException;
import org.json.JSONArray;

import java.io.IOException;
import java.util.List;

/**
 * @author Vytautas Gimbutas <v.gimbutas@evp.lt>
 */
public interface ArrayDenormalizerInterface<T> {
    List<T> mapToEntity(JSONArray data) throws NormalizerException, IOException;
}
