/**
 * @Title: Business.java
 * @Package com.adamjwh.gof.proxy.dynamic_proxy
 * @Description:
 * @author adamjwh
 * @date 2018年8月9日
 * @version V1.0
 */
package com.moses.design.gof.proxy.dynamic_proxy;

/**
 * @author adamjwh
 * @ClassName: Business
 * @Description: 具体实现类/被代理的对象
 * @date 2018年8月9日
 */
public class Business implements IBusiness {
    @Override
    public void doWork() {
        System.out.println("进行业务逻辑处理");
    }
}
