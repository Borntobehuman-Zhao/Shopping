package com.zyx.shopping.ware.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zyx.shopping.ware.entity.PurchaseEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 采购信息
 * 
 * @author Zhaoyx
 * @email Zhaoyunxin0922@outlook.com
 * @date 2020-10-19 18:34:06
 */
@Mapper
public interface PurchaseDao extends BaseMapper<PurchaseEntity> {
	
}
