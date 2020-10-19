package com.zyx.shopping.coupon.dao;

import com.zyx.shopping.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author Zhaoyx
 * @email Zhaoyunxin0922@outlook.com
 * @date 2020-10-19 16:56:49
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
