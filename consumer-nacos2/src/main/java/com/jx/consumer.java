package com.jx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @description:
 * @author: juxiang
 * @createDate: 2021/5/31
 * @version: 1.0
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class consumer {
    public static void main(String[] args) {
        SpringApplication.run(consumer.class,args);
    }
}
