package com.winwang.storybooks.entity;

/**
 * Created by WinWang on 2019/6/10
 * Description->
 */
public class HomeReqBean {

//    String body = "{'version':'1.2.3.0'," +
//            "'merchantid':'10000'," +
//            "'command':'1269'," +
//            "'clienttype':'3'," +
//            "'clientversion':'1.2.3.0'," +
//            "'IMEI':'864329033907351'," +
//            "'UserID':'225903'," +
//            "'advsource':'Oppo'," +
//            "'bdate':''," +
//            "'md':'fa974d3ba8b798b9119ea837b536f744'}";

    private String version;
    private String merchantid;
    private String command;
    private String clienttype;
    private String clientversion;
    private String IMEI;
    private String UserID;
    private String advsource;
    private String bdate;
    private String md;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getMerchantid() {
        return merchantid;
    }

    public void setMerchantid(String merchantid) {
        this.merchantid = merchantid;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public String getClienttype() {
        return clienttype;
    }

    public void setClienttype(String clienttype) {
        this.clienttype = clienttype;
    }

    public String getClientversion() {
        return clientversion;
    }

    public void setClientversion(String clientversion) {
        this.clientversion = clientversion;
    }

    public String getIMEI() {
        return IMEI;
    }

    public void setIMEI(String IMEI) {
        this.IMEI = IMEI;
    }

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String userID) {
        UserID = userID;
    }

    public String getAdvsource() {
        return advsource;
    }

    public void setAdvsource(String advsource) {
        this.advsource = advsource;
    }

    public String getBdate() {
        return bdate;
    }

    public void setBdate(String bdate) {
        this.bdate = bdate;
    }

    public String getMd() {
        return md;
    }

    public void setMd(String md) {
        this.md = md;
    }
}
