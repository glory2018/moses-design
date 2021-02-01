package com.moses.design.pattern.bridge.mode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 密码支付方式
 */
public class PayCypherMode implements IPayMode {
    protected Logger logger = LoggerFactory.getLogger(PayCypherMode.class);

    @Override
    public boolean security(String uId) {
        logger.info("密码支付，风控校验环境安全");
        return true;
    }
}
