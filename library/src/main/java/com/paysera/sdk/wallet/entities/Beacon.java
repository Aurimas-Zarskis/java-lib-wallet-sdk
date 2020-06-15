package com.paysera.sdk.wallet.entities;

import com.squareup.moshi.Json;

/**
 * @author Vytautas Gimbutas <v.gimbutas@evp.lt>
 */
public class Beacon {
    protected String key;
    protected String code;
    @Json(name = "code_info")
    protected CodeInfo codeInfo;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public CodeInfo getCodeInfo() {
        return codeInfo;
    }

    public void setCodeInfo(CodeInfo codeInfo) {
        this.codeInfo = codeInfo;
    }
}
