package com.zyx.shopping.member.dao;

import com.zyx.shopping.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author Zhaoyx
 * @email Zhaoyunxin0922@outlook.com
 * @date 2020-10-19 18:10:02
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
