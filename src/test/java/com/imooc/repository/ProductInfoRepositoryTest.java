package com.imooc.repository;

import com.imooc.dataobject.ProductInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author 张勇
 * @version 1.0
 * @date 2020/12/28 21:39
 * @description TODO
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoRepositoryTest {

    @Autowired
    private ProductInfoRepository repository;

    @Test
    public void saveTest(){
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("1");
        productInfo.setProductName("稀饭");
        productInfo.setProductStock(20);
        productInfo.setProductDescription("好吃的稀饭");
        productInfo.setProductStatus(1);
        productInfo.setCategoryType(1);
        productInfo.setProductPrice(new BigDecimal(123.3));
        ProductInfo save = repository.save(productInfo);
        System.out.println(save);
    }

    @Test
    public void findByProductStatus() {
        List<ProductInfo> byProductStatus = repository.findByProductStatus(1);
        byProductStatus.forEach(System.out::println);
    }

    @Test
    public void findAll(){
        List<ProductInfo> all = repository.findAll();
        all.forEach(System.out::println);
    }

    @Test
    public void findOne(){
        ProductInfo one = repository.findOne("1");
        System.out.println(one);
    }


}