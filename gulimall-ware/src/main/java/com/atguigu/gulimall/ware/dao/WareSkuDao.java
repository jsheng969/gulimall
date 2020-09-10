package com.atguigu.gulimall.ware.dao;

import com.atguigu.gulimall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author jsheng
 * @email jsheng@outlook.com
 * @date 2020-09-09 13:49:28
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
