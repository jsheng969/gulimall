package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author Jsheng
 * @email ${email}
 * @date 2021-07-07 15:10:08
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
