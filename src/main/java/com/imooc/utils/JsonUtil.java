package com.imooc.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


/**
 * @author zy
 * @version 1.0
 * @date 2020/12/29 14:53
 * @description JSON转化工具
 */
public class JsonUtil {

    public static String toJson(Object object) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting();
        Gson gson = gsonBuilder.create();
        return gson.toJson(object);
    }

}
