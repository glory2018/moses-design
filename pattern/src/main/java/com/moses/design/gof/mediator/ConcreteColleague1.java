/**
 * @Title: ConcreteColleague1.java
 * @Package com.adamjwh.gof.mediator
 * @Description:
 * @author adamjwh
 * @date 2018年7月28日
 * @version V1.0
 */
package com.moses.design.gof.mediator;

/**
 * @author adamjwh
 * @ClassName: ConcreteColleague1
 * @Description: 具体同事对象
 * @date 2018年7月28日
 */
public class ConcreteColleague1 extends Colleague {
    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    public void send(String message) {
        mediator.send(message, this);
    }

    public void notify(String message) {
        System.out.println("同事1得到消息：" + message);
    }
}
