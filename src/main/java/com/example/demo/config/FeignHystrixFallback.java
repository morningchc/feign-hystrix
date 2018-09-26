package com.example.demo.config;

import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018/9/26.
 */
@Component
public class FeignHystrixFallback implements FeignClientConfig {
   public  String testHystrix(int num){
       return "休息休息一下吧";
    }
}