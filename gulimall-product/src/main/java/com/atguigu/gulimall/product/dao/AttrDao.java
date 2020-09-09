package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.AttrEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品属性
 * 
 * @author jsheng
 * @email jsheng@outlook.com
 * @date 2020-09-08 17:37:51
 */
@Mapper
public interface AttrDao extends BaseMapper<AttrEntity> {
	
}
