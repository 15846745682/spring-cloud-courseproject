package com.course.filter;

import com.netflix.zuul.ZuulFilter;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;

public class ZuulPreFilter extends ZuulFilter {
    //过滤器类型
    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE;
    }
    //过滤器顺序
    @Override
    public int filterOrder() {
        return 0;
    }
    //是否要启用
    @Override
    public boolean shouldFilter() {
        return false;
    }

    @Override
    public Object run() {
        System.out.println("在路由请求前执行");
        return null;
    }
}
