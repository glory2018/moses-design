package com.moses.design.pattern.decorator;

import com.moses.design.pattern.decorator.base.HandlerInterceptor;

/**
 * sso装饰器
 *
 * @author Moses
 * @date 2021/02/03
 */
public abstract class SsoDecorator implements HandlerInterceptor {
    private HandlerInterceptor handlerInterceptor;

    private SsoDecorator() {
    }

    public SsoDecorator(HandlerInterceptor handlerInterceptor) {
        this.handlerInterceptor = handlerInterceptor;
    }

    @Override
    public boolean preHandle(String request, String response, Object handler) {
        return handlerInterceptor.preHandle(request, response, handler);
    }
}
