package com.imooc.dto;

import lombok.Data;

/**
 * @author zy
 * @version 1.0
 * @date 2020/12/29 15:08
 * @description 购物车传输对象
 */
@Data
public class CartDTO {

    /**
     * 商品ID
     */
    private String productId;

    /**
     * 购买数量
     */
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }

}
