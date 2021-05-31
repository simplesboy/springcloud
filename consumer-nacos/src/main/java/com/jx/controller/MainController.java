package com.jx.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: juxiang
 * @createDate: 2021/5/31
 * @version: 1.0
 **/
@RestController
@Slf4j
public class MainController {
    @Value("${config.info}")
    private String info;

    @GetMapping(value = "/consumer/payment/nacos/{id}")
    public String paymentInfo(@PathVariable("id") String id)
    {
        return "do success!";
    }

    @GetMapping(value = "/consumer/payment/config")
    public String paymentInfo()
    {
        return info;
    }
}
