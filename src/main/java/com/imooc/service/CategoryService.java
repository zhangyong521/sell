package com.imooc.service;

import com.imooc.dataobject.ProductCategory;

import java.util.List;

/**
 * @author 张勇
 * @version 1.0
 * @date 2020/12/28 18:06
 * @description 类目的逻辑层
 */
public interface CategoryService {
    /**
     * 根据类目Id查询类目
     *
     * @param categoryId
     * @return
     */
    ProductCategory findOne(Integer categoryId);

    /**
     * 查询是有的类目
     *
     * @return
     */
    List<ProductCategory> findAll();

    /**
     * 根据类目编号查询类目
     *
     * @param categoryTypeList
     * @return
     */
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    /**
     * 保存类目
     *
     * @param productCategory
     * @return
     */
    ProductCategory save(ProductCategory productCategory);

}
