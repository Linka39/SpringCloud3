package com.linka39;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;


@SpringBootApplication(exclude={DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
@EnableZuulProxy
//Zuul路由并没有访问消费者，而是直接访问服务提供者的路径
//如果请求超时的话，不会触发hystrix熔断机制，会报500错误
public class ZuulApplication_3001 {

    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication_3001.class, args);
    }
}
