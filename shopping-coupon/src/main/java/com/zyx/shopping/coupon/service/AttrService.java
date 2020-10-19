package com.zyx.shopping.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zyx.common.utils.PageUtils;
import com.zyx.shopping.coupon.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author Zhaoyx
 * @email Zhaoyunxin0922@outlook.com
 * @date 2020-10-19 14:53:56
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

