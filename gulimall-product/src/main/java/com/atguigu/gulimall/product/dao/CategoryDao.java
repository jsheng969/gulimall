package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author Jsheng
 * @email ${email}
 * @date 2021-07-06 14:12:04
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
