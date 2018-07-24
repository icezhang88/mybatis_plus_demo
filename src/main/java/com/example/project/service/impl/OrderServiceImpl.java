package com.example.project.service.impl;

import com.example.project.entity.Order;
import com.example.project.mapper.OrderMapper;
import com.example.project.service.OrderService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单表 服务实现类
 * </p>
 *
 * @author liushiqiang
 * @since 2018-07-24
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

}
