package com.zyx.shopping.product.dao;

import com.zyx.shopping.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author Zhaoyx
 * @email Zhaoyunxin0922@outlook.com
 * @date 2020-10-19 15:11:23
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
