package com.moses.design.pattern.command.cook.impl;

import com.moses.design.pattern.command.cook.ICook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 江苏厨师
 *
 * @author Moses
 * @date 2021/02/03
 */
public class JiangSuCook implements ICook {
    private Logger logger = LoggerFactory.getLogger(ICook.class);

    @Override
    public void doCooking() {
        logger.info("江苏厨师，烹饪苏菜，宫廷第二大菜系，古今国宴上最受人欢迎的菜系。");
    }
}
