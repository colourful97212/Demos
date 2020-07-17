package com.colourful.springbootlittiledemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.colourful.springbootlittiledemo"})
@MapperScan(basePackages ="com.colourful.springbootlittiledemo.dao")
public class SpringbootlittiledemoApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(SpringbootlittiledemoApplication.class, args);
    }

}
