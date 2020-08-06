package com.space.alzheimer.common.filter;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.core.annotation.Order;
import org.springframework.web.util.ContentCachingRequestWrapper;
import org.springframework.web.util.ContentCachingResponseWrapper;
import org.springframework.web.util.WebUtils;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author: 飞鸟 (feiniao@51huxin.com)
 * @createDate: 2017/5/15
 * @company: (C) Copyright 阳光互信 2017
 * @since: JDK 1.8
 * @description:
 */
@Order(1)
@WebFilter(filterName = "logFilter", urlPatterns = "/*")
@Slf4j
public class LogFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init1========");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
        if (!(request instanceof ContentCachingRequestWrapper)) {
            request = new ContentCachingRequestWrapper((HttpServletRequest) request);
        }
        if (!(response instanceof ContentCachingResponseWrapper)) {
            response = new ContentCachingResponseWrapper((HttpServletResponse) response);
        }

        ContentCachingRequestWrapper requestWrapper = WebUtils.getNativeRequest(request, ContentCachingRequestWrapper.class);
        ContentCachingResponseWrapper responseWrapper = WebUtils.getNativeResponse(response, ContentCachingResponseWrapper.class);

        String logToken = RandomStringUtils.randomNumeric(6);
        requestWrapper.setAttribute("_logToken", logToken);

        System.out.println(requestWrapper.getParameter("head"));

        log.info("{} url={}", logToken, requestWrapper.getRequestURL() + (StringUtils.isEmpty(
                requestWrapper.getQueryString()) ? "" : ("?" + requestWrapper.getQueryString())));
        MultiReadHttpServletRequest multiReadRequest = new MultiReadHttpServletRequest((HttpServletRequest) request);
        filterChain.doFilter(multiReadRequest, response);

        if (requestWrapper.getMethod().equalsIgnoreCase("POST")) {
            if (responseWrapper.getStatusCode()==401) {
                responseWrapper.setStatus(200);
            }
            log.info("{} requestBody={}", logToken, new String(requestWrapper.getContentAsByteArray()));
            log.info("{} responseBody={}", logToken, new String(responseWrapper.getContentAsByteArray()));
        }

        copyBodyToResponse(response);
    }

    @Override
    public void destroy() {

    }

    private void copyBodyToResponse(ServletResponse response) throws IOException {
        ContentCachingResponseWrapper responseWrapper = WebUtils.getNativeResponse(response, ContentCachingResponseWrapper.class);
        responseWrapper.copyBodyToResponse();
    }
}
