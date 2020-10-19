package com.zyx.shopping.order.dao;

import com.zyx.shopping.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author Zhaoyx
 * @email Zhaoyunxin0922@outlook.com
 * @date 2020-10-19 18:31:57
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
