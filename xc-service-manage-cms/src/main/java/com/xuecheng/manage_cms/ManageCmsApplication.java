package com.xuecheng.manage_cms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan("com.xuecheng.framework.domain.cms") //扫描实体类  扫描model用entity
@ComponentScan(basePackages = {"com.xuecheng.api"}) //扫描接口   扫描接口用component
@ComponentScan(basePackages = {"com.xuecheng.manage_cms"}) //扫描本项目下的所有类
public class ManageCmsApplication {
    public static void main(String[] args) {
        SpringApplication.run(ManageCmsApplication.class,args);
    }
}
