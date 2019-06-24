package com.suneee.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan(basePackages={"com.suneee"})
public class EurekaClientAApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientAApplication.class, args);
	}
}
