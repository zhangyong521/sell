package com.imooc.repository;


import com.imooc.dataobject.OrderMaster;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

/**
 * @author zy
 * @version 1.0
 * @date 2020/12/29 11:37
 * @description 测试订单
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderMasterRepositoryTest {

    @Autowired
    private OrderMasterRepository repository;

    @Test
    public void findByBuyerOpenid() {
        PageRequest pageRequest = new PageRequest(0, 3);
        Page<OrderMaster> byBuyerOpenid = repository.findByBuyerOpenid("4544554", pageRequest);
        byBuyerOpenid.forEach(System.out::println);
    }

    /**
     * 测试查询一条数据
     */
    @Test
    public void findOneTest() {
        OrderMaster one = repository.findOne("122332");
        System.out.println(one.toString());
    }

    /**
     * 保存数据
     */
    @Test
    public void saveTest() {
        OrderMaster data = new OrderMaster();
        data.setOrderId("123456");
        data.setBuyerName("周三");
        data.setBuyerPhone("13765287862");
        data.setBuyerAddress("贵阳");
        data.setBuyerOpenid("4544554");
        data.setOrderAmount(new BigDecimal(123.2));
        OrderMaster save = repository.save(data);
        System.out.println(save);
    }

    /**
     * 查询出来更新数据
     */
    @Test
    public void saveOrUpdateTest() {
        OrderMaster data = repository.findOne("1234");
        data.setOrderStatus(1);
        data.setPayStatus(1);
        OrderMaster save = repository.save(data);
        System.out.println(save);
    }

}
