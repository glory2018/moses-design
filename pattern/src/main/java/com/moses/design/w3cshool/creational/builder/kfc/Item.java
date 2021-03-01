/*
 * Copyright © 2021 287664409@qq.com Inc. All rights reserved
 * @version V1.0
 */
package com.moses.design.w3cshool.creational.builder.kfc;

/**
 * 食物条目和食物包装的接口
 *
 * @author Moses
 * @date 2021/2/28
 */
public interface Item {
    //食物名称
    public String name();

    //包装
    public Packing packing();

    //价格
    public float price();
}
