package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author Jsheng
 * @email ${email}
 * @date 2021-07-07 15:00:35
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
