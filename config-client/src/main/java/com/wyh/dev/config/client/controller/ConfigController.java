package com.wyh.dev.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wyh on 2017/3/7.
 */
@RestController
@RefreshScope
public class ConfigController {
    @Value("${config.server.port}")
    private String serverPort;

    @RequestMapping("/value")
    public String value() {
        return this.serverPort;
    }
}
