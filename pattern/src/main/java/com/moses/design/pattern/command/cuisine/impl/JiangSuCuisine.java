package com.moses.design.pattern.command.cuisine.impl;

import com.moses.design.pattern.command.cook.ICook;
import com.moses.design.pattern.command.cuisine.ICuisine;

/**
 * 江苏（苏菜）
 *
 * @author Moses
 * @date 2021/02/03
 */
public class JiangSuCuisine implements ICuisine {
    private ICook cook;

    public JiangSuCuisine(ICook cook) {
        this.cook = cook;
    }

    @Override
    public void cook() {
        cook.doCooking();
    }
}