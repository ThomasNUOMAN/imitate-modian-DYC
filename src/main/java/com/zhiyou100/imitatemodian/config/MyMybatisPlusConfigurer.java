package com.zhiyou100.imitatemodian.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author DingYC
 * @create 2019-05-15 16:50
 **/
@Configuration
@MapperScan("com.zhiyou100.imitatemodian.mapper")
public class MyMybatisPlusConfigurer {

    /**
     * 分页插件
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }



}
