package com.imooc.service.impl;

import com.imooc.dataobject.OrderDetail;
import com.imooc.dto.OrderDTO;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;


/**
 * @author zy
 * @version 1.0
 * @date 2020/12/29 15:40
 * @description 测试订单service
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class OrderServiceImplTest {

    @Autowired
    private OrderServiceImpl service;

    private final String BUYER_OPENID = "110110";

    @Test
    public void create() {

        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setBuyerName("李四");
        orderDTO.setBuyerAddress("贵阳");
        orderDTO.setBuyerPhone("13578582000");
        orderDTO.setBuyerOpenid(BUYER_OPENID);

        //购物车
        List<OrderDetail> orderDetailList = new ArrayList<>();
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setProductId("2");
        orderDetail.setProductQuantity(5);
        orderDetailList.add(orderDetail);

        orderDTO.setOrderDetailList(orderDetailList);

        OrderDTO result = service.create(orderDTO);
        log.info("【创建订单】 result", result);
    }

    @Test
    public void findOne() {
        OrderDTO one = service.findOne("1609230230632444774");
        System.out.println(one);
    }

    @Test
    public void findList() {
        PageRequest pageRequest = new PageRequest(0, 2);
        Page<OrderDTO> list = service.findList(BUYER_OPENID, pageRequest);
        list.forEach(System.out::println);

    }

    @Test
    public void cancel() {
        OrderDTO orderDTO = service.findOne("1609230230632444774");
        OrderDTO cancel = service.cancel(orderDTO);
        System.out.println(cancel);
    }

    @Test
    public void finish() {
        OrderDTO orderDTO = service.findOne("1609230041395382132");
        OrderDTO cancel = service.finish(orderDTO);
        System.out.println(cancel);
    }

    @Test
    public void paid() {
        OrderDTO orderDTO = service.findOne("1609230230632444774");
        OrderDTO cancel = service.paid(orderDTO);
        System.out.println(cancel);
    }
}