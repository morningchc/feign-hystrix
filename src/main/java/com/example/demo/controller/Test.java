package com.example.demo.controller;

import com.example.demo.config.FeignClientConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sun.awt.SunHints;

/**
 * Created by Administrator on 2018/9/26.
 */
@RequestMapping(value="/test")
@RestController
public class Test {
    @Autowired
    private FeignClientConfig feignClientConfig;

    @GetMapping("/test")
    public String test(@RequestParam int num){
        String msg = "";
        msg =feignClientConfig.testHystrix(num);
        return msg;
    }

}


