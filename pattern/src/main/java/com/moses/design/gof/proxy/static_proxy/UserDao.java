/**
 * @Title: UserDao.java
 * @Package com.adamjwh.gof.proxy.static_proxy
 * @Description:
 * @author adamjwh
 * @date 2018年8月9日
 * @version V1.0
 */
package com.moses.design.gof.proxy.static_proxy;

/**
 * @author adamjwh
 * @ClassName: UserDao
 * @Description: 具体目标类/被代理对象
 * @date 2018年8月9日
 */
public class UserDao implements IUserDao {
    @Override
    public void save() {
        System.out.println("数据已保存！！！");
    }
}
