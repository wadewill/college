package com.grow.college;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ApigateApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApigateApplication.class, args);
		System.out.println("===============apigateway启动完成===============");
	}
}
