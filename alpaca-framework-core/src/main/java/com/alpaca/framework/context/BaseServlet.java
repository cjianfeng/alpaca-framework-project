package com.alpaca.framework.context;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.DispatcherServlet;

import com.alpaca.framework.constant.Constant;

/**
 * 
 * @description 扩展SpringMVC调用方式
 * @author caojianfeng
 * @time 2016年8月23日下午3:55:52
 */
public class BaseServlet extends DispatcherServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1272229685152274405L;
	
	@Override
	protected void doService(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String requestUrl = request.getRequestURI();
		// TODO:增加对接口调用方式的校验
		if (null != requestUrl && requestUrl.endsWith(Constant.EXTERNAL_SUFFIX)) {
			
		} else {
			super.doService(request, response);
		}
	}

}
