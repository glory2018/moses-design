/*
 * Copyright © 2021 287664409@qq.com Inc. All rights reserved
 * @version V1.0
 */
package com.moses.design.w3cshool.creational.builder.kfc;

/**
 * 杯装
 *
 * @author Moses
 * @date 2021/2/28
 */
public class Bottle implements Packing {
    //包装
    @Override
    public String pack() {
        return "纸杯";
    }
}