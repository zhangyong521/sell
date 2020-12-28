package com.imooc.VO;

import lombok.Data;

/**
 * @author 张勇
 * @version 1.0
 * @date 2020/12/28 23:06
 * @description VO是返回给前端数据形式
 */
@Data
public class ResultVO<T> {

    /**
     * 返回的状态码
     */
    private Integer code;

    /**
     * 返回的提示信息
     */
    private String msg;

    /**
     * 返回的数据
     */
    private T data;


}
