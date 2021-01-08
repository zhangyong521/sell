package com.imooc.service;


import com.imooc.dto.OrderDTO;

/**
 * @author 张勇
 * @version 1.0
 * @date 2020/1/7 10:39
 * @description 消息推送逻辑层接口
 */
public interface PushMessageService {

    /**
     * 订单状态改变通知
     * @param orderDTO
     */
    void orderStatus(OrderDTO orderDTO);
}
