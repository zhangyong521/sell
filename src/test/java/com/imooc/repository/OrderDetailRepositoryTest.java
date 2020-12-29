package com.imooc.repository;


import com.imooc.dataobject.OrderDetail;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;


/**
 * @author zy
 * @version 1.0
 * @date 2020/12/29 12:08
 * @description 测试订单详情信息
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderDetailRepositoryTest {

    @Autowired
    private OrderDetailRepository repository;

    @Test
    public void findByOrderId() {
        List<OrderDetail> byOrderId = repository.findByOrderId("123456");
        byOrderId.forEach(System.out::println);
    }

    /**
     * 测试查询一条数据
     */
    @Test
    public void findOneTest() {
        OrderDetail one = repository.findOne("211524");
        System.out.println(one.toString());
    }

    /**
     * 保存数据
     */
    @Test
    public void saveTest() {
        OrderDetail data = new OrderDetail();
        data.setDetailId("211524");
        data.setOrderId("123456");
        data.setProductId("1");
        data.setProductName("小洲");
        data.setProductPrice(new BigDecimal(12.33));
        data.setProductQuantity(3);
        data.setProductIcon("http://ssa");
        OrderDetail save = repository.save(data);
        System.out.println(save);
    }

    /**
     * 查询出来更新数据
     */
    @Test
    public void saveOrUpdateTest() {
        OrderDetail data = repository.findOne("1234");
        OrderDetail save = repository.save(data);
        System.out.println(save);
    }

}
