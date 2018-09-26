package com.example.demo.config;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * Created by Administrator on 2018/9/26.
 */
@FeignClient(name="CLIENT",fallback = FeignHystrixFallback.class)
public interface FeignClientConfig {
    @PostMapping(value = "/welcome/testHystrix")
    String testHystrix(@RequestBody int num);
}
