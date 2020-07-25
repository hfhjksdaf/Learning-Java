package com.dalaoyang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer //启动服务注册中心
public class SpringcloudSofalookoutServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudSofalookoutServerApplication.class, args);
    }

}
