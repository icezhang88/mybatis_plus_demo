package com.example.project;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.mapper.Condition;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.example.project.entity.Order;
import com.example.project.entity.OrderPayment;
import com.example.project.mapper.OrderMapper;
import com.example.project.service.OrderService;
import com.example.project.utils.ChainMap;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisPlusDemoApplicationTests {

	@Autowired
	private OrderService orderService;

	@Autowired
	private OrderMapper orderMapper;

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

	@Test
	public void testOrderList(){
		Page<Order> page = new Page<>();
		page.setSize(2);
		page.setCurrent(0);
		EntityWrapper<Order> entityWrapper = new EntityWrapper<>();
		Condition condition = Condition.create();
		condition.eq("order_status", 2);
		Page selectPage = orderService.selectPage(page, condition);
		System.out.println(selectPage);
	}

	@Test
	public void testActiveRecord(){

		OrderPayment orderPayment = new OrderPayment();
		OrderPayment one = orderPayment.selectOne(new Condition().eq("order_id", "1531465388112018"));
		one.setPayRemark("pay test");
		boolean update = one.updateById();
		boolean delete = one.deleteById();
		System.out.println(one);

	}

	@Test
	public void testList(){
		Page page = new Page();
		page.setCurrent(1);
		page.setSize(5);
		page.setOrderByField("create_date");
		page.setAsc(true);

		ChainMap chainMap = ChainMap.createMap("status", 1).append("orderId", "1530775842506048");

		page.setCondition(chainMap);
		List<JSONObject> orderDetail = orderMapper.findOrderDetail(page,page.getCondition());

		System.out.println(orderDetail);
	}
}
