package com.imooc.repository;

import com.imooc.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author 张勇
 * @version 1.0
 * @date 2020/12/28 21:35
 * @description 商品信息的dao层
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo,String> {

    /**
     * 根据商品上架的查
     * @param productStatusId
     * @return
     */
    List<ProductInfo> findByProductStatus(Integer productStatusId);

}
