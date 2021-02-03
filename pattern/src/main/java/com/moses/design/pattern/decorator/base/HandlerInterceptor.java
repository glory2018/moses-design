package com.moses.design.pattern.decorator.base;

/**
 * 处理程序拦截器
 *
 * @author Moses
 * @date 2021/02/03
 */
public interface HandlerInterceptor {
    boolean preHandle(String request, String response, Object handler);
}
