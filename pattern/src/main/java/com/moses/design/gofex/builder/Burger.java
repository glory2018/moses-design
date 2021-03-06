package com.moses.design.gofex.builder;

/**
 * 汉堡
 *
 * @author adamjwh
 */
public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float getPrice();
}
