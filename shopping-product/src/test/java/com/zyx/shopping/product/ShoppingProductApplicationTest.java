package com.zyx.shopping.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zyx.shopping.product.entity.BrandEntity;
import com.zyx.shopping.product.service.BrandService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


/**
 * @author : Zhaoy
 * @motto :生而为人我很抱歉
 * @date : 2020/10/19 16:33
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ShoppingProductApplicationTest {
    @Autowired
    BrandService brandService;
    @Test
    public void contextLoads(){
        BrandEntity brandEntity = new BrandEntity();
       /* brandEntity.setName("华为");
        brandService.save(brandEntity);
        System.out.println("保存成功");*/
     /*   brandEntity.setBrandId(6L);
        brandEntity.setName("华为");
        brandEntity.setDescript("huawei");*/
        List<BrandEntity> brand_id = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
        brand_id.forEach(System.out::println);
    }
}