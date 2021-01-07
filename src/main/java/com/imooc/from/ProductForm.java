package com.imooc.from;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author zy
 * @version 1.0
 * @date 2021/1/7 9:55
 * @description 保存商品表单信息
 */
@Data
public class ProductForm {

    private String productId;

    /**
     * 名字.
     */
    private String productName;

    /**
     * 单价.
     */
    private BigDecimal productPrice;

    /**
     * 库存.
     */
    private Integer productStock;

    /**
     * 描述.
     */
    private String productDescription;

    /**
     * 小图.
     */
    private String productIcon;

    /**
     * 类目编号.
     */
    private Integer categoryType;

}
