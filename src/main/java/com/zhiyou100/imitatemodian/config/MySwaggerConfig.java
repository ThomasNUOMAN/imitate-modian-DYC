package com.zhiyou100.imitatemodian.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author DingYC
 * @create 2019-05-10 16:18
 **/
@Configuration
@EnableSwagger2
public class MySwaggerConfig {

    @Bean // 把方法的返回值注入到 IoC 容器
    public Docket api() {

        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.zhiyou100.imitatemodian.controller"))
                .paths(PathSelectors.any())
                .build();

    }


    private ApiInfo apiInfo() {

        return new ApiInfoBuilder()
                .title("仿摩点的小项目 Api 接口测试文档")
                .description("xxxxxxxxx")
                .version("1.0")
                .build();
    }

}
