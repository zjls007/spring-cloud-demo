package com.wyh.dev.feign.controller;

import com.wyh.dev.feign.client.ProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wyh on 2017/3/7.
 */
@RestController
public class FeignController {
    @Autowired
    private ProviderClient providerClient;

    @RequestMapping(value = "/add")
    public String add() {
        return providerClient.add(10, 20).toString();
    }
}
