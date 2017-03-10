package com.wyh.dev.feign.client.hystrix;

import com.wyh.dev.feign.client.ProviderClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by wyh on 2017/3/7.
 */
@Component
public class ProviderClientHystrix implements ProviderClient {
    @Override
    public Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b) {
        return -99999;
    }
}
