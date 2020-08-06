package com.space.alzheimer.common.filter;

/**
 * @ClassName LogCostFilter
 * @Description: TODO
 * @Author ljh
 * @Date 2020/5/16
 **/

import org.springframework.core.annotation.Order;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Order(2)
@WebFilter(filterName = "logCostFilter", urlPatterns = "/*")
public class LogCostFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
            throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
//        request.setCharacterEncoding("GBK");
        response.setContentType("text/html;charset=utf-8");
        HttpSession session = request.getSession(false);
        String requestURI = request.getRequestURI();

//        if (requestURI.equals("/alzheimer/") || requestURI.endsWith(".css") || requestURI.endsWith(".js")
//                || requestURI.endsWith(".woff") || requestURI.endsWith(".ico") || requestURI.endsWith(".png")
//                || requestURI.contains("/uploadPic")){
//            filterChain.doFilter(servletRequest, servletResponse);
//            return;
//        }
//        if (!requestURI.contains("login") && !requestURI.contains("register")
//                && !requestURI.contains("forgotPwd") && !requestURI.contains("logout")) {
//            if (session != null && session.getAttribute("loginUser") != null) {
//                filterChain.doFilter(request, response);
//            } else {
//                String requestType = request.getHeader("X-Requested-With");
//                if (requestType != null && "XMLHttpRequest".equals(requestType)) {
//                    response.getWriter().write("{\"code\":\"50014\",\"msg\":\"未登录\"}");
//                } else {
//                    response.getWriter().write("{\"code\":\"50014\",\"msg\":\"未登录\"}");
//                }
//                return;
//            }
//        } else {
            filterChain.doFilter(servletRequest, servletResponse);
//        }

    }

    @Override
    public void destroy() {
        System.out.println("destroy");
    }
}



