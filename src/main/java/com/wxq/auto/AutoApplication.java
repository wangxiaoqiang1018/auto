package com.wxq.auto;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author wangxiaoqiang
 * @date 2020/4/8 9:33
 * @description
 */
@SpringBootApplication
@MapperScan("com.wxq.auto.mapper")
@EnableSwagger2Doc
public class AutoApplication {
    public static void main(String[] args) {
        SpringApplication.run(AutoApplication.class,args);
    }
}
