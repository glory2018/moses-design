package com.moses.design.pattern.strategy.impl;

import com.moses.design.pattern.strategy.ICouponDiscount;

import java.math.BigDecimal;

/**
 * <p>
 * n元购买
 */
public class NYGCouponDiscount implements ICouponDiscount<Double> {
    /**
     * n元购购买
     * 1. 无论原价多少钱都固定金额购买
     */
    @Override
    public BigDecimal discountAmount(Double couponInfo, BigDecimal skuPrice) {
        return new BigDecimal(couponInfo);
    }
}
