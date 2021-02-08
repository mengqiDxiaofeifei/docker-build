package com.zhou.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther: zhj
 * @date: 2021/2/8 17:25
 * @description:
 */
@RestController
public class TestController {


    @RequestMapping("/test")
    public String test(){
        return "success";
    }
}
