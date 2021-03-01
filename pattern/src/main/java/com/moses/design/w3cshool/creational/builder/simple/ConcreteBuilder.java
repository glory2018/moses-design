package com.moses.design.w3cshool.creational.builder.simple;

/**
 * @author Moses
 * @date 2021/3/1
 */
public class ConcreteBuilder extends Builder {
    @Override
    public void buildPartA() {
        product.setPartA("建造 PartA");
    }

    @Override
    public void buildPartB() {
        product.setPartB("建造 PartB");
    }

    @Override
    public void buildPartC() {
        product.setPartC("建造 PartC");
    }
}