package com.moses.design.pattern.bridge.channel;

import com.moses.design.pattern.bridge.mode.IPayMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

/**
 * 支付
 *
 * @author Moses
 * @date 2021/02/03
 */
public abstract class Pay {
    protected Logger logger = LoggerFactory.getLogger(Pay.class);
    protected IPayMode payMode;

    public Pay(IPayMode payMode) {
        this.payMode = payMode;
    }

    public abstract String transfer(String uId, String tradeId, BigDecimal amount);
}
