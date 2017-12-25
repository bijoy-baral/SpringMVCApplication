package com.ta.spring.mvc.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoggingInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest httpzServletRequest, HttpServletResponse httpServletResponse,
			Object objectHandler) throws Exception {
		
		System.out.println("LoggingInterceptor applied before processing request. preHandle()");
		return true;
	}
}
