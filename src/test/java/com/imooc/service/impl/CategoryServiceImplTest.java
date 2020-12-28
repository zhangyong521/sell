package com.imooc.service.impl;

import com.imooc.dataobject.ProductCategory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

/**
 * @author 张勇
 * @version 1.0
 * @date 2020/12/28 18:12
 * @description TODO
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryServiceImplTest {

    @Autowired
    private CategoryServiceImpl categoryService;

    @Test
    public void findOne() {
        ProductCategory one = categoryService.findOne(1);
        System.out.println(one.toString());
    }

    @Test
    public void findAll() {
        List<ProductCategory> all = categoryService.findAll();
        all.forEach(System.out::println);
    }

    @Test
    public void findByCategoryTypeIn() {
        List<Integer> integers = Arrays.asList(2, 3, 4);
        List<ProductCategory> byCategoryTypeIn = categoryService.findByCategoryTypeIn(integers);
        byCategoryTypeIn.forEach(System.out::println);
    }

    @Test
    public void save() {
        ProductCategory category = new ProductCategory("你的最爱", 5);
        ProductCategory save = categoryService.save(category);
        System.out.println(save);
    }

}