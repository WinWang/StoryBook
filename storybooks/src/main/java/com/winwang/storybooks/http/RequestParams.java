package com.winwang.storybooks.http;

import com.alibaba.fastjson.JSONObject;
import com.blankj.utilcode.util.EncryptUtils;
import com.winwang.storybooks.AppConfig;

import java.util.LinkedHashMap;

/**
 * Created by WinWang on 2019/6/14
 * Description->请求公共参数封装
 */
public class RequestParams {

    private String version = "1.2.3.0";
    private String merchantid = "10000";
    private String clienttype = "3";
    private String clientversion = "1.2.3.0";
    private String IMEI = "864329033907351";
    private String UserID = "225903";
    private String advsource = "Oppo";


    /**
     * 经测试废弃，md5加密对顺序有要求
     *
     * @param hashMap
     * @return
     */
    @Deprecated
    public String getParams(LinkedHashMap<String, String> hashMap) {
        StringBuilder builder = new StringBuilder();
        JSONObject jsonObject = new JSONObject();
        for (String s : hashMap.keySet()) {
            String value = hashMap.get(s);
            jsonObject.put(s, value);
            builder.append(value);
        }
        jsonObject.put("version", version);
        builder.append(version);
        jsonObject.put("merchantid", merchantid);
        builder.append(merchantid);
        jsonObject.put("clienttype", clienttype);
        builder.append(clienttype);
        jsonObject.put("clientversion", clientversion);
        builder.append(clientversion);
        jsonObject.put("IMEI", IMEI);
        builder.append(IMEI);
        jsonObject.put("UserID", UserID);
        builder.append(UserID);
        jsonObject.put("advsource", advsource);
        builder.append(advsource);
        String md5 = EncryptUtils.encryptMD5ToString(builder.toString() + AppConfig.MD5_KEY);
        jsonObject.put("md", md5);
        return jsonObject.toJSONString();
    }


}
