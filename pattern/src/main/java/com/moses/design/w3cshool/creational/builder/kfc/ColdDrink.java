/*
 * Copyright © 2021 287664409@qq.com Inc. All rights reserved
 * @version V1.0
 */
package com.moses.design.w3cshool.creational.builder.kfc;

/**
 * @author Moses
 * @date 2021/2/28
 */
public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    //价格
    @Override
    public abstract float price();
}