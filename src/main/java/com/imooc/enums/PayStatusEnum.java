package com.imooc.enums;

import lombok.Getter;

/**
 * @author zy
 * @version 1.0
 * @date 2020/12/29 11:16
 * @description 订单状态的枚举
 */
@Getter
public enum PayStatusEnum {
    /**
     * 订单状态的枚举
     */
    WAIT(0, "等待支付"),
    SUCCESS(1, "支付成功"),
    ;

    private Integer code;
    private String message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
