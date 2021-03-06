/**
 * @Title: Memento.java
 * @Package com.adamjwh.gof.memento
 * @Description:
 * @author adamjwh
 * @date 2018年7月31日
 * @version V1.0
 */
package com.moses.design.gof.memento;

/**
 * @author adamjwh
 * @ClassName: Memento
 * @Description: 备忘录角色
 * @date 2018年7月31日
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
