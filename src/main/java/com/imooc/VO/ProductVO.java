package com.imooc.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * @author 张勇
 * @version 1.0
 * @date 2020/12/28 23:22
 * @description 商品数据（包含类目）
 */
@Data
public class ProductVO {

    /**
     * 商品类目的名字
     * JsonProperty("name") 为了和前端返回的名字保持一致
     */
    @JsonProperty("name")
    private String categoryName;

    /**
     * 类目编号
     */
    @JsonProperty("type")
    private Integer categoryType;

    /**
     * 返回的商品集合
     */
    @JsonProperty("foods")
    private List<ProductInfoVO> productInfoVOList;


}
