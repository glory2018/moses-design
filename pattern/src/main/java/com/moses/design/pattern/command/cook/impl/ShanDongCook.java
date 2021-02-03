package com.moses.design.pattern.command.cook.impl;

import com.moses.design.pattern.command.cook.ICook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 山东厨师
 *
 * @author Moses
 * @date 2021/02/03
 */
public class ShanDongCook implements ICook {
    private Logger logger = LoggerFactory.getLogger(ICook.class);

    @Override
    public void doCooking() {
        logger.info("山东厨师，烹饪鲁菜，宫廷最大菜系，以孔府风味为龙头");
    }
}
