package com.zyx.shopping.member.feign;

import com.zyx.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author : Zhaoy
 * @motto :生而为人我很抱歉
 * @date : 2020/10/20 20:12
 */
@FeignClient("shopping-coupon")
public interface CouponFeginService {
    @RequestMapping("coupon/coupon/member/list")
    public R memberCoupon();
}
