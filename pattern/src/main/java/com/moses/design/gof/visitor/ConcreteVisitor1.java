/**
 * @Title: ConcreteVisitor1.java
 * @Package com.adamjwh.gof.visitor
 * @Description:
 * @author adamjwh
 * @date 2018年7月29日
 * @version V1.0
 */
package com.moses.design.gof.visitor;

/**
 * @author adamjwh
 * @ClassName: ConcreteVisitor1
 * @Description: 具体访问者1
 * @date 2018年7月29日
 */
public class ConcreteVisitor1 extends Visitor {
    @Override
    public void visitConcreteElementA(ConcreteElementA concreteElementA) {
        System.out.println(concreteElementA.getClass().getName() + " 被 " + this.getClass().getName() + " 访问");
    }

    @Override
    public void visitConcreteElementB(ConcreteElementB concreteElementB) {
        System.out.println(concreteElementB.getClass().getName() + " 被 " + this.getClass().getName() + " 访问");
    }
}
