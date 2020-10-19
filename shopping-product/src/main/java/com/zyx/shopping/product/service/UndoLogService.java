package com.zyx.shopping.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zyx.common.utils.PageUtils;
import com.zyx.shopping.product.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author Zhaoyx
 * @email Zhaoyunxin0922@outlook.com
 * @date 2020-10-19 15:11:22
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

