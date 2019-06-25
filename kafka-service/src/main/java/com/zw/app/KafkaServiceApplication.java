package com.zw.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.ComponentScan;


import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;

@SpringBootApplication
@ComponentScan(basePackages= {"com.zw"})
@EnableDubbo(scanBasePackages="com.zw.service.impl")
public class KafkaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaServiceApplication.class, args);
	}

}
