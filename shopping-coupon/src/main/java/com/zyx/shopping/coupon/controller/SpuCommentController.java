package com.zyx.shopping.coupon.controller;

import java.util.Arrays;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zyx.shopping.coupon.entity.SpuCommentEntity;
import com.zyx.shopping.coupon.service.SpuCommentService;
import com.zyx.common.utils.PageUtils;
import com.zyx.common.utils.R;



/**
 * 商品评价
 *
 * @author Zhaoyx
 * @email Zhaoyunxin0922@outlook.com
 * @date 2020-10-19 14:53:55
 */
@RestController
@RequestMapping("coupon/spucomment")
public class SpuCommentController {
    @Autowired
    private SpuCommentService spuCommentService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("coupon:spucomment:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = spuCommentService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("coupon:spucomment:info")
    public R info(@PathVariable("id") Long id){
		SpuCommentEntity spuComment = spuCommentService.getById(id);

        return R.ok().put("spuComment", spuComment);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("coupon:spucomment:save")
    public R save(@RequestBody SpuCommentEntity spuComment){
		spuCommentService.save(spuComment);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("coupon:spucomment:update")
    public R update(@RequestBody SpuCommentEntity spuComment){
		spuCommentService.updateById(spuComment);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("coupon:spucomment:delete")
    public R delete(@RequestBody Long[] ids){
		spuCommentService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
