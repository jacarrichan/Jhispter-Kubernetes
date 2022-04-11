package com.mycompany.myapp.gateway;

import com.mycompany.myapp.gateway.responserewriting.SwaggerBasePathRewritingFilter;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author jacarrichan
 */
@Component
public class PrintRequestFilter extends ZuulFilter {
    private final Logger log = LoggerFactory.getLogger(SwaggerBasePathRewritingFilter.class);

    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        log.info("request url :{}", ctx.getRequest().getRequestURI());
        return null;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 10000;
    }
}
