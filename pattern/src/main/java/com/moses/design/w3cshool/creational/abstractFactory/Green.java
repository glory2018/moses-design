/*
 * Copyright © 2021 287664409@qq.com Inc. All rights reserved
 * @version V1.0
 */
package com.moses.design.w3cshool.creational.abstractFactory;

/**
 * @author Moses
 * @date 2021/2/28
 */
public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}