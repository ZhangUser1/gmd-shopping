package com.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@MapperScan("com.springcloud.dao")    //����Mybatis�ӿڵ�λ��
@EnableEurekaClient
public class SpringCloudGoodsProvider {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudGoodsProvider.class, args);
	}
}
