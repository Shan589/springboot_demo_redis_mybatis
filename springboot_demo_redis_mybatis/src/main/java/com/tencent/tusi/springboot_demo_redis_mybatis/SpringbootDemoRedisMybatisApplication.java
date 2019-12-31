package com.tencent.tusi.springboot_demo_redis_mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableCaching
@EnableTransactionManagement
@MapperScan("com.tencent.tusi.springboot_demo_redis_mybatis.dao")
public class SpringbootDemoRedisMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDemoRedisMybatisApplication.class, args);
    }

}
