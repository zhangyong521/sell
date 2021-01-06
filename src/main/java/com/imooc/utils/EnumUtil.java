package com.imooc.utils;

import com.imooc.enums.CodeEnum;

/**
 * @author zy
 * @version 1.0
 * @date 2020/12/29 14:53
 * @description 枚举的工具类
 */
public class EnumUtil {

    public static <T extends CodeEnum> T getByCode(Integer code, Class<T> enumClass) {
        for (T each: enumClass.getEnumConstants()) {
            if (code.equals(each.getCode())) {
                return each;
            }
        }
        return null;
    }

}
