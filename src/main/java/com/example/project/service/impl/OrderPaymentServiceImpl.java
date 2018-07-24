package com.example.project.service.impl;

import com.example.project.entity.OrderPayment;
import com.example.project.mapper.OrderPaymentMapper;
import com.example.project.service.OrderPaymentService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单支付表 服务实现类
 * </p>
 *
 * @author liushiqiang
 * @since 2018-07-24
 */
@Service
public class OrderPaymentServiceImpl extends ServiceImpl<OrderPaymentMapper, OrderPayment> implements OrderPaymentService {

}
