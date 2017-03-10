package com.wyh.dev.feign.client;

import com.wyh.dev.feign.client.hystrix.ProviderClientHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by wyh on 2017/3/7.
 */
@FeignClient(value = "provider-server", fallback = ProviderClientHystrix.class)
public interface ProviderClient {

    @RequestMapping(value = "/add")
    Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b);
}
