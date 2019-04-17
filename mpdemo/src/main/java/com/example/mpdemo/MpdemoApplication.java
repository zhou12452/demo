package com.example.mpdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@EnableScheduling
@SpringBootApplication
@MapperScan(basePackages = {"com.example.mpdemo.mapper"})
public class MpdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MpdemoApplication.class, args);
	}

}
