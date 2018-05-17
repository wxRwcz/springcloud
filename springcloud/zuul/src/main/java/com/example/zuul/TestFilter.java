package com.example.zuul;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
@Component
public class TestFilter extends ZuulFilter {


    @Override
    public String filterType() {
        return "pre";
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
    public Object run() throws ZuulException {
        RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest request = context.getRequest();
        Object accessToken = request.getParameter("KEY");
        if(accessToken == null){
            context.setSendZuulResponse(false);
            context.setResponseStatusCode(401);
            try{
                context.getResponse().getWriter().write("KEY ???");
            }catch (Exception e){

            }
        }
        return  null;
    }
}
