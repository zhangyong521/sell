package com.imooc.constant;

/**
 * @author 张勇
 * @version 1.0
 * @date 2020/1/7 10:39
 * @description redis常量
 */
public interface RedisConstant {

    /**
     * 存储前缀
     */
    String TOKEN_PREFIX = "token_%s";

    /**
     * 过期时间
     */
    Integer EXPIRE = 7200;

}
