package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;

@EnableDubbo
@SpringBootApplication(scanBasePackages="com.example.demo.zw")

public class StartbootDubboConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(StartbootDubboConsumerApplication.class, args);
	}

}
