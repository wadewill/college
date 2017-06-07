package com.grow.college.apigateway.controller;

import com.grow.college.apigateway.http.CommandHttpCall;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by chen on 17-6-6.
 */
@Controller
@RequestMapping("/api/")
public class ApiController {

    /**
     * app对外统一接口
     * 1.token验证
     * 2.参数正确验证
     * 3.参数合法性
     * 4.日志
     * @param data
     * @return
     */
    @RequestMapping("/common")
    @ResponseBody
    public Object api(String data){
        data = "http://localhost:9002/api/common";
        String str = new CommandHttpCall(data).execute();
        return str;
    }
}
