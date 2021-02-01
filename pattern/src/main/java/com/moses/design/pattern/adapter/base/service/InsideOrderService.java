package com.moses.design.pattern.adapter.base.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 内部下单
 */
public class InsideOrderService {
    private Logger logger = LoggerFactory.getLogger(POPOrderService.class);

    /**
     * 查询⽤户下单数量
     *
     * @param userId
     * @return
     */
    public long queryUserOrderCount(String userId) {
        logger.info("自营商家，查询用户的订单是否为首单：{}", userId);
        return 10L;
    }
}
