package com.moses.design.pattern.factory.simple;

import com.moses.design.pattern.factory.simple.store.ICommodity;
import com.moses.design.pattern.factory.simple.store.impl.CardCommodityService;
import com.moses.design.pattern.factory.simple.store.impl.CouponCommodityService;
import com.moses.design.pattern.factory.simple.store.impl.GoodsCommodityService;

public class StoreFactory {
    public ICommodity getCommodityService(Integer commodityType) {
        if (null == commodityType) {
            return null;
        }
        if (1 == commodityType) {
            return new CouponCommodityService();
        }
        if (2 == commodityType) {
            return new GoodsCommodityService();
        }
        if (3 == commodityType) {
            return new CardCommodityService();
        }
        throw new RuntimeException("不存在的商品服务类型");
    }
}
