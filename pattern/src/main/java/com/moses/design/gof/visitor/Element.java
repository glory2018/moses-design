/**
 * @Title: Element.java
 * @Package com.adamjwh.gof.visitor
 * @Description:
 * @author adamjwh
 * @date 2018年7月29日
 * @version V1.0
 */
package com.moses.design.gof.visitor;

/**
 * @author adamjwh
 * @ClassName: Element
 * @Description: 抽象元素
 * @date 2018年7月29日
 */
public abstract class Element {
    public abstract void accept(Visitor visitor);
}
