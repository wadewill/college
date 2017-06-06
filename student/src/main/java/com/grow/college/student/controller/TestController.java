package com.grow.college.student.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by chen on 17-6-6.
 */
@Controller
@RequestMapping("/api/")
public class TestController {

    @RequestMapping("/common")
    @ResponseBody
    public String common(String data){
        return "common";
    }
}
