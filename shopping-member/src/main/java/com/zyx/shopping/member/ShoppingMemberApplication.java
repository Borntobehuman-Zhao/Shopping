package com.zyx.shopping.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = "com.zyx.shopping.member.feign")
@EnableDiscoveryClient
@SpringBootApplication
public class ShoppingMemberApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoppingMemberApplication.class, args);
	}

}
