/*
 * Copyright © 2021 287664409@qq.com Inc. All rights reserved
 * @version V1.0
 */
package com.moses.design.w3cshool.creational.abstractFactory;

/**
 * @author Moses
 * @date 2021/2/28
 */
public class ColorFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType) {
        return null;
    }

    @Override
    Color getColor(String color) {
        if (color == null) {
            return null;
        }
        if (color.equalsIgnoreCase("RED")) {
            return new Red();
        } else if (color.equalsIgnoreCase("GREEN")) {
            return new Green();
        } else if (color.equalsIgnoreCase("BLUE")) {
            return new Blue();
        }
        return null;
    }
}
