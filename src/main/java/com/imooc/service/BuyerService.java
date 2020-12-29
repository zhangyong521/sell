package com.imooc.service;

import com.imooc.dto.OrderDTO;

/**
 * @author 张勇
 * @version 1.0
 * @date 2020/12/30 0:09
 * @description 订单处理
 */
public interface BuyerService {
    /**
     * 查询一个订单
     * @param openid
     * @param orderId
     * @return
     */
    OrderDTO findOrderOne(String openid, String orderId);

    /**
     * 取消订单
     * @param openid
     * @param orderId
     * @return
     */
    OrderDTO cancelOrder(String openid, String orderId);

}
