/**
 * @Title: Mediator.java
 * @Package com.adamjwh.gof.mediator
 * @Description:
 * @author adamjwh
 * @date 2018年7月28日
 * @version V1.0
 */
package com.moses.design.gof.mediator;

/**
 * @author adamjwh
 * @ClassName: Mediator
 * @Description: 抽象中介者角色
 * @date 2018年7月28日
 */
public abstract class Mediator {
    //抽象的发送消息方法
    public abstract void send(String message, Colleague colleague);
}
