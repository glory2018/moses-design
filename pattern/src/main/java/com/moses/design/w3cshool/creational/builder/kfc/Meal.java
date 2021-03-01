/*
 * Copyright © 2021 287664409@qq.com Inc. All rights reserved
 * @version V1.0
 */
package com.moses.design.w3cshool.creational.builder.kfc;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Moses
 * @date 2021/2/28
 */
public class Meal {
    private List<Item> items = new ArrayList<Item>();

    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost() {
        float cost = 0.0f;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems() {
        for (Item item : items) {
            System.out.print("餐品 : " + item.name());
            System.out.print(", 包装 : " + item.packing().pack());
            System.out.println(", 价格 : " + item.price());
        }
    }
}