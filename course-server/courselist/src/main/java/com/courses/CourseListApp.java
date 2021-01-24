package com.courses;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
//开启eureka客户端注解
@EnableEurekaClient
public class CourseListApp {
    public static void main(String[] args) {
        SpringApplication.run(CourseListApp.class,args);
    }
}
