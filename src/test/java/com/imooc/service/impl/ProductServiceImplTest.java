package com.imooc.service.impl;

import com.imooc.dataobject.ProductInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author 张勇
 * @version 1.0
 * @date 2020/12/28 22:17
 * @description 测试商品的service层
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceImplTest {
    @Autowired
    private ProductServiceImpl service;

    @Test
    public void findOne() {
        ProductInfo one = service.findOne("1");
        System.out.println(one);
    }

    @Test
    public void findUpAll() {
        List<ProductInfo> upAll = service.findUpAll();
        upAll.forEach(System.out::println);
    }

    @Test
    public void findAll() {
        PageRequest page = new PageRequest(0, 2);
        Page<ProductInfo> all = service.findAll(page);
        all.forEach(System.out::println);
    }

    @Test
    public void save() {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("1234");
        productInfo.setProductName("啊稀饭");
        productInfo.setProductStock(20);
        productInfo.setProductDescription("好饭");
        productInfo.setProductStatus(0);
        productInfo.setCategoryType(2);
        productInfo.setProductPrice(new BigDecimal(13.3));
        ProductInfo save = service.save(productInfo);
        System.out.println(save);
    }
}