package com.moses.design.pattern.decorator.base;

public interface HandlerInterceptor {
    boolean preHandle(String request, String response, Object handler);
}
