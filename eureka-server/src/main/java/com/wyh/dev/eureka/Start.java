package com.wyh.dev.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by wyh on 2017/3/7.
 */
@EnableEurekaServer
@SpringBootApplication
public class Start {

    public static void main(String[] args) {
        SpringApplication.run(Start.class, args);
    }
}
