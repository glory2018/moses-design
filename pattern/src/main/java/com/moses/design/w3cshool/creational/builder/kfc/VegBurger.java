/*
 * Copyright © 2021 287664409@qq.com Inc. All rights reserved
 * @version V1.0
 */
package com.moses.design.w3cshool.creational.builder.kfc;

/**
 * 蔬菜堡
 *
 * @author Moses
 * @date 2021/2/28
 */
public class VegBurger extends Burger {
    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "蔬菜堡";
    }
}
