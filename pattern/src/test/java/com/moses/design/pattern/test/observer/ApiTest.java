package com.moses.design.pattern.test.observer;

import com.alibaba.fastjson.JSON;
import com.moses.design.pattern.observer.LotteryResult;
import com.moses.design.pattern.observer.LotteryService;
import com.moses.design.pattern.observer.LotteryServiceImpl;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ApiTest {
    private Logger logger = LoggerFactory.getLogger(ApiTest.class);

    @Test
    public void test() {
        LotteryService lotteryService = new LotteryServiceImpl();
        LotteryResult result = lotteryService.draw("2765789109876");
        logger.info("测试结果：{}", JSON.toJSONString(result));
    }
}
