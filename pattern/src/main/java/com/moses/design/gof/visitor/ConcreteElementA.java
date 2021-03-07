/**
 * @Title: ConcreteElementA.java
 * @Package com.adamjwh.gof.visitor
 * @Description:
 * @author adamjwh
 * @date 2018年7月29日
 * @version V1.0
 */
package com.moses.design.gof.visitor;

/**
 * @author adamjwh
 * @ClassName: ConcreteElementA
 * @Description: 具体元素A
 * @date 2018年7月29日
 */
public class ConcreteElementA extends Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitConcreteElementA(this);
    }

    //其它方法
    public void operationA() {
    }
}
