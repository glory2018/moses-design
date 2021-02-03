package com.moses.design.pattern.command.cuisine.impl;

import com.moses.design.pattern.command.cook.ICook;
import com.moses.design.pattern.command.cuisine.ICuisine;

/**
 * 广东（粤菜）
 *
 * @author Moses
 * @date 2021/02/03
 */
public class GuangDoneCuisine implements ICuisine {
    private ICook cook;

    public GuangDoneCuisine(ICook cook) {
        this.cook = cook;
    }

    @Override
    public void cook() {
        cook.doCooking();
    }
}
