package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author Jsheng
 * @email ${email}
 * @date 2021-07-07 15:22:01
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
