/*
 * Copyright © 2021 287664409@qq.com Inc. All rights reserved
 * @version V1.0
 */
package com.moses.design.w3cshool.creational.builder.kfc;

/**
 * @author Moses
 * @date 2021/2/28
 */
public class Coke extends ColdDrink {
    //价格
    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "可口可乐";
    }
}
