package com.example.project.controller;


import com.baomidou.mybatisplus.plugins.Page;
import com.example.project.entity.Order;
import com.example.project.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

/**
 * <p>
 * 订单表 前端控制器
 * </p>
 *
 * @author liushiqiang
 * @since 2018-07-24
 */
@Controller
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("list")
    public String list(){

        Page<Order> page = new Page<>();
        orderService.selectPage(page);
        return null;
    }

}

