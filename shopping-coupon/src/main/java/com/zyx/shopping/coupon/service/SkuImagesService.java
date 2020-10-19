package com.zyx.shopping.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zyx.common.utils.PageUtils;
import com.zyx.shopping.coupon.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author Zhaoyx
 * @email Zhaoyunxin0922@outlook.com
 * @date 2020-10-19 14:53:55
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

