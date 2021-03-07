/**
 * @Title: Client.java
 * @Package com.adamjwh.gof.proxy.static_proxy
 * @Description:
 * @author adamjwh
 * @date 2018年8月9日
 * @version V1.0
 */
package com.moses.design.gof.proxy.static_proxy;

/**
 * @author adamjwh
 * @ClassName: Client
 * @Description: 代理模式——静态代理
 * @date 2018年8月9日
 */
public class Client {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        UserDaoProxy proxy = new UserDaoProxy(userDao);
        proxy.save();
    }
}
