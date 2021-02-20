package com.moses.design.pattern.responsibility.impl;

import com.alibaba.fastjson.JSON;
import com.moses.design.pattern.responsibility.AuthInfo;
import com.moses.design.pattern.responsibility.AuthLink;
import com.moses.design.pattern.responsibility.base.AuthService;

/**
 * 三级负责人
 */
public class Level3AuthLink extends AuthLink {
    public Level3AuthLink(String levelUserId, String levelUserName) {
        super(DIRECTOR, levelUserId, levelUserName);
    }

    @Override
    public void approval(String uId, String orderId) {
        AuthInfo authInfo = getInfo("agree", uId, orderId);
        logger.info("测试结果：{}", JSON.toJSONString(authInfo));
        AuthService.auth(uId, authInfo);
    }
}
