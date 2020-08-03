package com.paysera.sdk.wallet.entities.client;

import com.squareup.moshi.Json;

public class ApplicationClientInfo {
    private String title;
    private String os;
    private String model;
    private String imei;
    @Json(name = "device_id")
    private String deviceId;
    @Json(name = "rooted")
    private Boolean isRooted;
    @Json(name = "simulator")
    private Boolean isSimulator;
    @Json(name = "ip_ipv4")
    private String ipIpv4;
    @Json(name = "ip_ipv6")
    private String ipIpv6;
    @Json(name = "wifi_ssid")
    private String wifiSsid;
    @Json(name = "wifi_mac")
    private String wifiMac;
    @Json(name = "system_language")
    private String systemLanguage;
    @Json(name = "sim_country")
    private String simCountry;
    @Json(name = "sim_carrier")
    private String simCarrier;
    @Json(name = "pseudo_unique_id")
    private String pseudoUniqueId;
    @Json(name = "android_id")
    private String androidId;
    @Json(name = "android_gfsid")
    private String androidGfsid;
    @Json(name = "android_phone_fingerprint")
    private String androidPhoneFingerprint;
    @Json(name = "webview_user_agent")
    private String webviewUserAgent;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public Boolean getRooted() {
        return isRooted;
    }

    public void setRooted(Boolean rooted) {
        isRooted = rooted;
    }

    public Boolean getSimulator() {
        return isSimulator;
    }

    public void setSimulator(Boolean simulator) {
        isSimulator = simulator;
    }

    public String getIpIpv4() {
        return ipIpv4;
    }

    public void setIpIpv4(String ipIpv4) {
        this.ipIpv4 = ipIpv4;
    }

    public String getIpIpv6() {
        return ipIpv6;
    }

    public void setIpIpv6(String ipIpv6) {
        this.ipIpv6 = ipIpv6;
    }

    public String getWifiSsid() {
        return wifiSsid;
    }

    public void setWifiSsid(String wifiSsid) {
        this.wifiSsid = wifiSsid;
    }

    public String getWifiMac() {
        return wifiMac;
    }

    public void setWifiMac(String wifiMac) {
        this.wifiMac = wifiMac;
    }

    public String getSystemLanguage() {
        return systemLanguage;
    }

    public void setSystemLanguage(String systemLanguage) {
        this.systemLanguage = systemLanguage;
    }

    public String getSimCountry() {
        return simCountry;
    }

    public void setSimCountry(String simCountry) {
        this.simCountry = simCountry;
    }

    public String getSimCarrier() {
        return simCarrier;
    }

    public void setSimCarrier(String simCarrier) {
        this.simCarrier = simCarrier;
    }

    public String getPseudoUniqueId() {
        return pseudoUniqueId;
    }

    public void setPseudoUniqueId(String pseudoUniqueId) {
        this.pseudoUniqueId = pseudoUniqueId;
    }

    public String getAndroidId() {
        return androidId;
    }

    public void setAndroidId(String androidId) {
        this.androidId = androidId;
    }

    public String getAndroidGfsid() {
        return androidGfsid;
    }

    public void setAndroidGfsid(String androidGfsid) {
        this.androidGfsid = androidGfsid;
    }

    public String getAndroidPhoneFingerprint() {
        return androidPhoneFingerprint;
    }

    public void setAndroidPhoneFingerprint(String androidPhoneFingerprint) {
        this.androidPhoneFingerprint = androidPhoneFingerprint;
    }

    public String getWebviewUserAgent() {
        return webviewUserAgent;
    }

    public void setWebviewUserAgent(String webviewUserAgent) {
        this.webviewUserAgent = webviewUserAgent;
    }
}