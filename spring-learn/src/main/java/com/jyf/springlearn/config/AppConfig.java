package com.jyf.springlearn.config;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.jyf.springlearn")
//@MapperScan("sss")
public class AppConfig {
}
