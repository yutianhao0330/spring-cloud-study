package com.yutianhao.sc.sczuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author thyu
 * @title: AuthFilter
 * @projectName yutianhao-eureka-ribbon-parent
 * @description: TODO
 * @date 2020/7/17 15:24
 */
@Component
public class AuthFilter extends ZuulFilter {
    /**
     * filterType：返回一个字符串代表过滤器的类型，在zuul中定义了四种不同生命周期的过滤器类型，具体如下：
     * pre：路由之前
     * routing：路由之时
     * post： 路由之后
     * error：发送错误调用
     */
    @Override
    public String filterType() {
        return "pre";
    }
    /**
     * 过滤的顺序，数字越小优先级越高
     */
    @Override
    public int filterOrder() {
        return 2;
    }

    /**
     * 要不要过滤  false是放行，true是拦截
     * @return
     */
    @Override
    public boolean shouldFilter() {
        //业务逻辑判断,首先获取request对象，然后获取请求的url
        RequestContext context = RequestContext.getCurrentContext();
        String uri = context.getRequest().getRequestURI();
        //根据url前缀拦截请求
        if(uri.startsWith("/goodsService/")){
            return true;
        }
        return false;
    }

    /**
     * 过滤器的具体逻辑。
     * 可用很复杂，包括查sql，nosql去判断该请求到底有没有权限访问。
     */
    @Override
    public Object run() throws ZuulException {
        System.err.println("这里被执行了.............");
        //获取上下文
        RequestContext context = RequestContext.getCurrentContext();
        /** 表示不进行路由,不会被zuul转发到后端服务器 **/
        context.setSendZuulResponse(false);
        /** http状态码，标识未授权 **/
        context.setResponseStatusCode(401);
        HttpServletResponse response = context.getResponse();
        /** 设置返回的内容类型 **/
        response.setContentType("application/json;charset=utf-8");
        try {
            /** 输出返回结果 **/
            response.getWriter().write("{\"message\":\"未授权\"}");
            response.getWriter().flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
