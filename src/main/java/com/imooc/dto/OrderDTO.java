package com.imooc.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.imooc.dataobject.OrderDetail;
import com.imooc.enums.OrderStatusEnum;
import com.imooc.enums.PayStatusEnum;
import com.imooc.utils.EnumUtil;
import com.imooc.utils.serializer.Date2LongSerializer;
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
    @JsonSerialize(using = Date2LongSerializer.class)
    private Date createTime;
    /**
     * 修改时间
     */
    @JsonSerialize(using = Date2LongSerializer.class)
    private Date updateTime;

    /**
     * 绑定订单详情
     */
    List<OrderDetail> orderDetailList;

    /**
     * 在前端返回
     * 把数据库的0和1转换成新下单信息
     * @JsonIgnore 忽略
     * @return
     */
    @JsonIgnore
    public OrderStatusEnum getOrderStatusEnum() {
        return EnumUtil.getByCode(orderStatus, OrderStatusEnum.class);
    }

    /**
     * 在前端返回
     * 把数据库的0和1转换成支付信息
     *
     * @return
     */
    @JsonIgnore
    public PayStatusEnum getPayStatusEnum() {
        return EnumUtil.getByCode(payStatus, PayStatusEnum.class);
    }

}
