/*
 * Copyright © 2021 287664409@qq.com Inc. All rights reserved
 * @version V1.0
 */
package com.moses.design.w3cshool.creational.builder.kfc;

/**
 * @author Moses
 * @date 2021/2/28
 */
public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("蔬菜 套餐");
        vegMeal.showItems();
        System.out.println("总价: " + vegMeal.getCost());
        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\n非蔬菜 套餐");
        nonVegMeal.showItems();
        System.out.println("总价: " + nonVegMeal.getCost());
    }
}