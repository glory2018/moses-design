package com.moses.adapter.impl;

import com.moses.adapter.OrderAdapterService;
import com.moses.adapter.base.service.InsideOrderService;

public class InsideOrderAdapterServiceImpl implements OrderAdapterService {
    private InsideOrderService orderService = new InsideOrderService();

    @Override
    public boolean isFirst(String uId) {
        return orderService.queryUserOrderCount(uId) <= 1;
    }
}
