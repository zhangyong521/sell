package com.imooc.repository;

import com.imooc.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;

/**
 * @author 张勇
 * @version 1.0
 * @date 2020/12/28 16:46
 * @description 测试代码类目
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository repository;

    /**
     * 测试查询一条数据
     */
    @Test
    public void findOneTest() {
        ProductCategory one = repository.findOne(1);
        System.out.println(one.toString());
    }

    /**
     * 保存数据
     */
    @Test
    public void saveTest() {
        ProductCategory data = new ProductCategory();
        data.setCategoryName("女生最爱");
        data.setCategoryType(4);
        ProductCategory save = repository.save(data);
        System.out.println(save);
    }

    /**
     * 查询出来更新数据
     */
    @Test
    @Transactional //测试数据不保存
    public void saveOrUpdateTest() {
        ProductCategory data = repository.findOne(1);
        data.setCategoryName("他的最爱");
        data.setCategoryType(3);
        ProductCategory save = repository.save(data);
        System.out.println(save);
    }

    /**
     * 根据类目数组进行查询
     */
    @Test
    public void findByCategoryTypeInTest() {
        List<Integer> integers = Arrays.asList(2, 3, 4);
        List<ProductCategory> byCategoryTypeIn = repository.findByCategoryTypeIn(integers);
        Assert.assertNotEquals(0, byCategoryTypeIn.size());
    }

}
