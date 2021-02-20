package com.moses.design.pattern.test.flyweight;

import com.alibaba.fastjson.JSON;
import com.moses.design.pattern.flyweight.Activity;
import com.moses.design.pattern.flyweight.ActivityController;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * api测试
 *
 * @author fanshaorong
 * @date 2021/02/03
 */
public class ApiTest {
    private Logger logger = LoggerFactory.getLogger(ApiTest.class);
    private ActivityController activityController = new ActivityController();

    @Test
    public void test_queryActivityInfo() throws InterruptedException {
        for (int idx = 0; idx < 10; idx++) {
            Long req = 10001L;
            Activity activity = activityController.queryActivityInfo(req);
            logger.info("测试结果：{} {}", req, JSON.toJSONString(activity));
            Thread.sleep(1200);
        }
    }
}
