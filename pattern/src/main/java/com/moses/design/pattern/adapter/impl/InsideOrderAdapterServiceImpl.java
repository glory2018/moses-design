package com.moses.design.pattern.adapter.impl;

import com.moses.design.pattern.adapter.OrderAdapterService;
import com.moses.design.pattern.adapter.base.service.InsideOrderService;

public class InsideOrderAdapterServiceImpl implements OrderAdapterService {
    private InsideOrderService orderService = new InsideOrderService();

    @Override
    public boolean isFirst(String uId) {
        return orderService.queryUserOrderCount(uId) <= 1;
    }
}
