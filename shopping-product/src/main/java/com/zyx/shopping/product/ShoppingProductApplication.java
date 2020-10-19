package com.zyx.shopping.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Zhaoyx
 */
@MapperScan("com.zyx.shopping.product.dao")
@SpringBootApplication
public class ShoppingProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoppingProductApplication.class, args);
	}

}
