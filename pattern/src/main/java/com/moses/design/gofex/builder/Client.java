package com.moses.design.gofex.builder;

/**
 * 建造者模式——KFC点餐
 *
 * @author adamjwh
 */
public class Client {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        //获取第一个订单
        Meal order1 = mealBuilder.order1();
        System.out.println("------order1------");
        order1.showItem();
        System.out.println("总额：￥" + order1.getCost());
        //获取第二个订单
        Meal order2 = mealBuilder.order2();
        System.out.println("------order2------");
        order2.showItem();
        System.out.println("总额：￥" + order2.getCost());
    }
}
