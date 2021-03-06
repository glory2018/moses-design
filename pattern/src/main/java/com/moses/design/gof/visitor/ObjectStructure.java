/**
 * @Title: ObjectStructure.java
 * @Package com.adamjwh.gof.visitor
 * @Description:
 * @author adamjwh
 * @date 2018年7月29日
 * @version V1.0
 */
package com.moses.design.gof.visitor;

import java.util.LinkedList;
import java.util.List;

/**
 * @author adamjwh
 * @ClassName: ObjectStructure
 * @Description: 结构对象
 * @date 2018年7月29日
 */
public class ObjectStructure {
    private List<Element> elements = new LinkedList<>();

    public void attach(Element element) {
        elements.add(element);
    }

    public void detach(Element element) {
        elements.remove(element);
    }

    public void accept(Visitor visitor) {
        for (Element element : elements) {
            element.accept(visitor);
        }
    }
}
