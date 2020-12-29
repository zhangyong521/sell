package com.imooc.dataobject;

import com.imooc.enums.OrderStatusEnum;
import com.imooc.enums.PayStatusEnum;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author zy
 * @version 1.0
 * @date 2020/12/29 10:58
 * @description 订单实体
 */
@Entity
@Data
@DynamicUpdate
public class OrderMaster {
    /**
     * 订单ID
     */
    @Id
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
    private Integer orderStatus = OrderStatusEnum.NEW.getCode();
    /**
     * 支付状态
     * 默认为0等待支付
     */
    private Integer payStatus = PayStatusEnum.WAIT.getCode();
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 修改时间
     */
    private Date updateTime;
}
