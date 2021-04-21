package com.colourful.springbootlittiledemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;

@Configuration
@EnableAsync
@SpringBootApplication
@EnableCaching
@ComponentScan(basePackages = {"com.colourful.springbootlittiledemo"})
@MapperScan(basePackages ="com.colourful.springbootlittiledemo.oldSomething.dao")
public class SpringbootlittiledemoApplication extends SpringBootServletInitializer
{

    public static void main(String[] args)
    {
        SpringApplication.run(SpringbootlittiledemoApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SpringbootlittiledemoApplication.class);
    }

}
