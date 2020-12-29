package com.imooc.repository;


import com.imooc.dataobject.OrderMaster;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author zy
 * @version 1.0
 * @date 2020/12/29 11:04
 * @description 订单信息的dao层
 */
public interface OrderMasterRepository extends JpaRepository<OrderMaster, String> {
    /**
     * 根据买家ID查询订单
     *
     * @param buyerOpenid
     * @param pageable
     * @return
     */
    Page<OrderMaster> findByBuyerOpenid(String buyerOpenid, Pageable pageable);

}
