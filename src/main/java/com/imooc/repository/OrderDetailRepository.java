package com.imooc.repository;

import com.imooc.dataobject.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author zy
 * @version 1.0
 * @date 2020/12/29 11:33
 * @description 订单详情
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail, String> {

    /**
     * 根据订单id查询订单详情
     *
     * @param orderId
     * @return
     */
    List<OrderDetail> findByOrderId(String orderId);

}
