package com.imooc.utils;

import java.util.Random;

/**
 * @author zy
 * @version 1.0
 * @date 2020/12/29 14:53
 * @description 生成随机数
 */
public class KeyUtil {

    /**
     * 生成唯一的主键
     * 格式：时间+随机数
     * synchronized 多线程处理
     * @return
     */
    public static synchronized String genUniqueKey() {
        Random random = new Random();
        Integer number = random.nextInt(900000) + 100000;
        return System.currentTimeMillis() + String.valueOf(number);
    }

}


