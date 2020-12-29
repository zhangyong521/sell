package com.imooc.dto;

import com.imooc.dataobject.OrderDetail;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @author zy
 * @version 1.0
 * @date 2020/12/29 14:16
 * @description dto数据传输对象
 */
@Data
public class OrderDTO {

    /**
     * 订单ID
     */
    private String orderId;
    /**
     * 买家姓名
     */
    private String buyerName;
    /**
     * 买家电话
     */
    private String buyerPhone;
    /**
     * 买家地址
     */
    private String buyerAddress;
    /**
     * 订单ID
     */
    private String buyerOpenid;
    /**
     * 总金额
     */
    private BigDecimal orderAmount;
    /**
     * 订单状态
     * 默认为0新单
     */
    private Integer orderStatus;
    /**
     * 支付状态
     * 默认为0等待支付
     */
    private Integer payStatus;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 绑定订单详情
     */
    List<OrderDetail> orderDetailList;

}
