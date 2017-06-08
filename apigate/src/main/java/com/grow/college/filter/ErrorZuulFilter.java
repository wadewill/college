package com.grow.college.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.springframework.stereotype.Component;

/**
 * Created by w on 2017/6/8.
 */
@Component
public class ErrorZuulFilter extends ZuulFilter{
    @Override
    public String filterType() {
        return "post";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        ctx.setSendZuulResponse(false);// 对该请求进行路由
        ctx.setResponseStatusCode(401);// 返回错误码
        ctx.setResponseBody("{\"result\":\"username is not correct!\"}");// 返回错误内容
        ctx.set("isSuccess", false);

        return null;
    }
}
