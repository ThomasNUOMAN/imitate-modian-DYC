package com.zhiyou100.imitatemodian;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zhiyou100.imitatemodian.mapper")
public class ImitateModianApplication {

    public static void main(String[] args) {
        System.out.println("==================ready=================");
        SpringApplication.run(ImitateModianApplication.class, args);
        System.out.println("===================go=====================");
    }

}
