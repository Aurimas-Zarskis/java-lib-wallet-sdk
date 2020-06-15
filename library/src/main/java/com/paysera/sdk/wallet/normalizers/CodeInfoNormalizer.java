package com.paysera.sdk.wallet.normalizers;

import com.paysera.sdk.wallet.entities.CodeInfo;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import org.json.JSONObject;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Map;

/**
 * @author Vytautas Gimbutas <v.gimbutas@evp.lt>
 */
public class CodeInfoNormalizer implements DenormalizerInterface<CodeInfo> {
    protected Moshi moshi;

    public CodeInfoNormalizer(Moshi moshi) {
        this.moshi = moshi;
    }

    public CodeInfo mapToEntity(JSONObject data) throws IOException {
        CodeInfo codeInfo = new CodeInfo();
        Type type = Types.newParameterizedType(Map.class, String.class, Object.class);
        JsonAdapter<Map<String, Object>> mapAdapter = moshi.adapter(type);

        Map<String, Object> parameters = mapAdapter.fromJson(data.getJSONObject("parameters").toString());

        codeInfo.setParameters(parameters);
        codeInfo.setType(data.getString("type"));

        return codeInfo;
    }
}
