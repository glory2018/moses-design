/**
 * @Title: ConcreteSubject.java
 * @Package com.adamjwh.gof.observer
 * @Description:
 * @author adamjwh
 * @date 2018年5月28日
 * @version V1.0
 */
package com.moses.design.gof.observer;

/**
 * @author adamjwh
 * @ClassName: ConcreteSubject
 * @Description: 具体被观察者
 * @date 2018年5月28日
 */
public class ConcreteSubject extends Subject {
    //具体业务
    public void doSomething() {
        //...
        super.notifyObserver();
    }
}
