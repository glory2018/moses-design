/**
 * @Title: HelloMethodInterceptor.java
 * @Package com.adamjwh.gof.proxy.cglib_proxy
 * @Description:
 * @author adamjwh
 * @date 2018年8月9日
 * @version V1.0
 */
package com.moses.design.gof.proxy.cglib_proxy;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @ClassName: HelloMethodInterceptor
 * @Description: 拦截器（需要导入cglib依赖包）
 * @author adamjwh
 * @date 2018年8月9日
 *
 */
public class HelloMethodInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object object, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("before " + method.getName());
        methodProxy.invokeSuper(object, objects);
        System.out.println("after " + method.getName());
        return null;
    }
}
