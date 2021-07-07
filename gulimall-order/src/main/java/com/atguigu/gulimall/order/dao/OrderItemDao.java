package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author Jsheng
 * @email ${email}
 * @date 2021-07-07 15:22:01
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
