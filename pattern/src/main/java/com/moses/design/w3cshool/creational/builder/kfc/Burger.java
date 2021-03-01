/*
 * Copyright © 2021 287664409@qq.com Inc. All rights reserved
 * @version V1.0
 */
package com.moses.design.w3cshool.creational.builder.kfc;

/**
 * 汉堡
 *
 * @author Moses
 * @date 2021/2/28
 */
public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    //价格
    public abstract float price();
}