package com.zyx.shopping.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zyx.common.utils.PageUtils;
import com.zyx.shopping.coupon.entity.SkuSaleAttrValueEntity;

import java.util.Map;

/**
 * sku销售属性&值
 *
 * @author Zhaoyx
 * @email Zhaoyunxin0922@outlook.com
 * @date 2020-10-19 14:53:55
 */
public interface SkuSaleAttrValueService extends IService<SkuSaleAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

