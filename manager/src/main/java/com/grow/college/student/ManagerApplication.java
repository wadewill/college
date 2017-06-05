package com.grow.college.student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Created by chen on 17-6-5.
 */
@EnableConfigurationProperties
@SpringBootApplication
public class ManagerApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        System.out.println("================管理端启动===============");
        SpringApplication.run(ManagerApplication.class, args);
        System.out.println("================管理端启动完成===============");
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ManagerApplication.class).properties("spring");
    }
}
