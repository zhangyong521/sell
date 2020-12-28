package com.imooc.enums;

import lombok.Getter;

/**
 * @author 张勇
 * @version 1.0
 * @date 2020/12/28 22:07
 * @description 商品状态的枚举
 */
@Getter
public enum ProductStatusEnum {
    UP(0, "在架"),
    DOWN(1, "下架");

    private Integer code;
    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

}
