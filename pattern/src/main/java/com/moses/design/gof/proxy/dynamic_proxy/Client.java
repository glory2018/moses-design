/**
 * @Title: Client.java
 * @Package com.adamjwh.gof.proxy.dynamic_proxy
 * @Description:
 * @author adamjwh
 * @date 2018年8月9日
 * @version V1.0
 */
package com.moses.design.gof.proxy.dynamic_proxy;

import java.lang.reflect.Proxy;

/**
 * @author adamjwh
 * @ClassName: Client
 * @Description: 代理模式——动态代理
 * @date 2018年8月9日
 */
public class Client {
    public static void main(String[] args) {
        Business business = new Business();
        //生成代理类对象
        IBusiness proxy = (IBusiness) Proxy.newProxyInstance(
                business.getClass().getClassLoader(),
                business.getClass().getInterfaces(),
                new BusinessHandler(business));
        proxy.doWork();
    }
}
