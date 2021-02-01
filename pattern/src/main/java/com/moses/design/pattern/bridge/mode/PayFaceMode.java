package com.moses.design.pattern.bridge.mode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 面部识别支付方式
 */
public class PayFaceMode implements IPayMode {
    protected Logger logger = LoggerFactory.getLogger(PayCypherMode.class);

    @Override
    public boolean security(String uId) {
        logger.info("人脸支付，风控校验脸部识别");
        return true;
    }
}