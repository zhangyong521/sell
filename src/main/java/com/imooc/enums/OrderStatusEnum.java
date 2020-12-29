package com.imooc.enums;

import lombok.Getter;

/**
 * @author zy
 * @version 1.0
 * @date 2020/12/29 11:08
 * @description 订单详情枚举
 */
@Getter
public enum OrderStatusEnum {
    /**
     * 订单状态枚举
     */
    NEW(0, "新订单"),
    FINISHED(1, "完结订单"),
    CANCEL(2, "已取消"),
    ;

    private Integer code;
    private String message;

    OrderStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }


}
