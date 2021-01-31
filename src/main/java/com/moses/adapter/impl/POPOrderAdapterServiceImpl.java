package com.moses.adapter.impl;

import com.moses.adapter.OrderAdapterService;
import com.moses.adapter.base.service.POPOrderService;

public class POPOrderAdapterServiceImpl implements OrderAdapterService {
    private POPOrderService popOrderService = new POPOrderService();

    @Override
    public boolean isFirst(String uId) {
        return popOrderService.isFirstOrder(uId);
    }
}
