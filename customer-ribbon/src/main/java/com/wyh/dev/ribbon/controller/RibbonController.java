package com.wyh.dev.ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by wyh on 2017/3/7.
 */
@RestController
public class RibbonController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/add")
    public String add() {
        return restTemplate.getForEntity("http://provider-server/add?a=10&b=20", String.class).getBody();
    }


}
