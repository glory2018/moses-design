package com.moses.design.pattern.bridge.mode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 指纹识别支付方式
 */
public class PayFingerprintMode implements IPayMode {
    protected Logger logger = LoggerFactory.getLogger(PayCypherMode.class);

    @Override
    public boolean security(String uId) {
        logger.info("指纹支付，风控校验指纹信息");
        return true;
    }
}
