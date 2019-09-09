package com.springCloud.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@MapperScan("com.springCloud.provider.mapper")
@EnableEurekaClient		//启动服务客户端
public class Sanniu_User_Start {
    public static void main(String[] args) {
        SpringApplication.run(Sanniu_User_Start.class,args);
    }
}
