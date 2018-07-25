package com.example.project.controller;


import com.example.project.entity.Order;
import com.example.project.utils.Result;
import com.example.project.utils.ResultGenerator;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 订单表 前端控制器
 * </p>
 *
 * @author liushiqiang
 * @since 201-07-24
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @ApiOperation(value = "订单列表")
    @GetMapping("list")
    public Result list(@RequestParam Integer status){
        Order order = new Order();
        List<Order> orders = order.selectAll();
        return ResultGenerator.genSuccessResult(orders);
    }

}

