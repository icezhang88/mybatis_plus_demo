package com.example.project;

import com.example.project.entity.Order;
import com.example.project.service.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisPlusDemoApplicationTests {

	@Autowired
	private OrderService orderService;

	@Test
	public void contextLoads() {
	}

	@Test
	public void testOrderServiceGetFind(){
		Order order = orderService.selectById("1530775842506048");

		System.out.println(order.getCount());
	}

	@Test
	public void testOrderServiceInsert(){

		Order order = new Order();
		order.setOrderId("1245555");
		order.setOrderStatus(1);
		order.setProductId(123);
		order.setProductName("ceshi");
		order.setCount(1);
		order.setUnitPrice(1);
		order.setOrderAmount(2);
		order.setMemberId(1212);
		boolean insert = orderService.insert(order);
		System.out.println(insert);
	}
}
