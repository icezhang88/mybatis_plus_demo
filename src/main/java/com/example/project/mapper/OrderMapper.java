package com.example.project.mapper;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.plugins.Page;
import com.example.project.entity.Order;
import com.baomidou.mybatisplus.mapper.BaseMapper;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 订单表 Mapper 接口
 * </p>
 *
 * @author liushiqiang
 * @since 2018-07-24
 */
public interface OrderMapper extends BaseMapper<Order> {
    List<JSONObject> findOrderDetail(Page page, Map param);
}
