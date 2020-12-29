package com.imooc.exception;

import com.imooc.enums.ResultEnum;

/**
 * @author zy
 * @version 1.0
 * @date 2020/12/29 14:34
 * @description 异常同意处理
 */
public class SellException extends RuntimeException {

    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }

    public SellException(Integer code,String message) {
        super(message);
        this.code = code;
    }
}
