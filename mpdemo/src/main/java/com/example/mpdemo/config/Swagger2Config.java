package com.example.mpdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/*
 *  @项目名：  mpdemo 
 *  @包名：    com.example.mpdemo.config
 *  @文件名:   Swagger2Config
 *  @创建者:   zhouzhuo
 *  @创建时间:  2019/4/17 10:29
 *  @描述：    TODO
 */
@Configuration
public class Swagger2Config {

    @Bean
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.mpdemo"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("测试swagger")
                .description("swagger demo")
                .version("1.0")
                .build();
    }
}
