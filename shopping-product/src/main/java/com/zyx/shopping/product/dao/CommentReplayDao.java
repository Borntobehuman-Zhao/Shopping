package com.zyx.shopping.product.dao;

import com.zyx.shopping.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author Zhaoyx
 * @email Zhaoyunxin0922@outlook.com
 * @date 2020-10-19 15:45:50
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
