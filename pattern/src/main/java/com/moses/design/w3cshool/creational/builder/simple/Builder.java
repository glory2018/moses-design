package com.moses.design.w3cshool.creational.builder.simple;

/**
 * @author Moses
 * @date 2021/3/1
 */
public abstract class Builder {
    //创建产品对象
    protected Product product = new Product();

    public abstract void buildPartA();

    public abstract void buildPartB();

    public abstract void buildPartC();

    //返回产品对象
    public Product getResult() {
        return product;
    }
}