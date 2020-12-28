package com.imooc.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @author 张勇
 * @version 1.0
 * @date 2020/12/28 23:29
 * @description 返回前端的商品信息
 */
@Data
public class ProductInfoVO {

    /**
     * 商品ID
     */
    @JsonProperty("id")
    private String productId;

    /**
     * 商品姓名
     */
    @JsonProperty("name")
    private String productName;

    /**
     * 商品价格
     */
    @JsonProperty("price")
    private BigDecimal productPrice;

    /**
     * 商品详情
     */
    @JsonProperty("description")
    private String productDescription;

    /**
     * 商品小图
     */
    @JsonProperty("icon")
    private String productIcon;

}
