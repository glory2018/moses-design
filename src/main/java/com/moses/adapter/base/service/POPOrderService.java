package com.moses.adapter.base.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 第三⽅下单
 */
public class POPOrderService {
    private Logger logger = LoggerFactory.getLogger(POPOrderService.class);

    /**
     * 查询⽤户下单⾸单
     *
     * @param uId
     * @return
     */
    public boolean isFirstOrder(String uId) {
        logger.info("POP商家，查询用户的订单是否为首单：{}", uId);
        return true;
    }
}
