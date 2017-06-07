package com.grow.college.student.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chen on 17-6-6.
 */
@RestController
@RequestMapping("/api/")
public class TestController {

    @Value("${server.port}")
    String port;

    @RequestMapping("/common")
    @ResponseBody
    public String common(String data){
        return "common";
    }

    @RequestMapping("/hi")
    public String home(@RequestParam String name) {
        return "hi "+name+",i am from port:" +port;
    }
}
