package com.linka39;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer//服务注册中心必须要加
public class EurekaApplication_1085 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication_1085.class, args);
    }
}
