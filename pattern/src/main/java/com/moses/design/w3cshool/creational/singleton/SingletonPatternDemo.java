/*
 * Copyright © 2021 287664409@qq.com Inc. All rights reserved
 * @version V1.0
 */
package com.moses.design.w3cshool.creational.singleton;

/**
 * @author Moses
 * @date 2021/2/28
 */
public class SingletonPatternDemo {
    public static void main(String[] args) {
        //不合法的构造函数
        //编译时错误：构造函数 SingleObject() 是不可见的
        //SingleObject object = new SingleObject();
        //获取唯一可用的对象
        SingleObject object = SingleObject.getInstance();
        //显示消息
        object.showMessage();
    }
}
