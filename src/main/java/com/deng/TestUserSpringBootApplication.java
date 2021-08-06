package com.deng;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.deng.dao")
public class TestUserSpringBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(TestUserSpringBootApplication.class);
    }
}
