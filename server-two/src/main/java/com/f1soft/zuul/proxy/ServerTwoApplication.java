package com.f1soft.zuul.proxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Rashim Dhaubanjar
 */
@ComponentScan(basePackages = {"com.f1soft"})
@EnableCaching
@SpringBootApplication
public class ServerTwoApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(ServerTwoApplication.class, args);
    }
}
