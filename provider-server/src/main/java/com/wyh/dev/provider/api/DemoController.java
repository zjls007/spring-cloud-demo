package com.wyh.dev.provider.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wyh on 2017/3/7.
 */
@RestController
public class DemoController {
    private final Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/add")
    public Integer add(Integer a, Integer b) {
        ServiceInstance instance = client.getLocalServiceInstance();
        Integer r = a + b;
        logger.info("/add, host:" + instance.getHost() + ", service_id:" + instance.getServiceId() + ", result:" + r);
        return r;
    }
}
