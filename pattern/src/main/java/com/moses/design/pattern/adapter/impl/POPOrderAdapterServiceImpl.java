package com.moses.design.pattern.adapter.impl;

import com.moses.design.pattern.adapter.OrderAdapterService;
import com.moses.design.pattern.adapter.base.service.POPOrderService;

/**
 * impl poporder适配器服务
 *
 * @author Moses
 * @date 2021/02/03
 */
public class POPOrderAdapterServiceImpl implements OrderAdapterService {
    private POPOrderService popOrderService = new POPOrderService();

    @Override
    public boolean isFirst(String uId) {
        return popOrderService.isFirstOrder(uId);
    }
}
