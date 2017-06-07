package com.grow.college.student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by chen on 17-6-5.
 */
@EnableConfigurationProperties
@SpringBootApplication
@EnableEurekaClient
public class StudentApplication extends SpringBootServletInitializer {//{
    public static void main(String[] args) {
        System.out.println("================学生服务端启动===============");
        SpringApplication.run(StudentApplication.class, args);
        System.out.println("================学生服务端启动完成===============");
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(StudentApplication.class).properties("spring");
    }
}
