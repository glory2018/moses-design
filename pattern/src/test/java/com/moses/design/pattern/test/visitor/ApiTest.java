package com.moses.design.pattern.test.visitor;

import com.moses.design.pattern.visitor.DataView;
import com.moses.design.pattern.visitor.visitor.impl.Parent;
import com.moses.design.pattern.visitor.visitor.impl.Principal;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ApiTest {
    private Logger logger = LoggerFactory.getLogger(ApiTest.class);

    @Test
    public void test() {
        DataView dataView = new DataView();
        logger.info("\r\n家长视角访问：");
        dataView.show(new Parent());     // 家长
        logger.info("\r\n校长视角访问：");
        dataView.show(new Principal());  // 校长
    }
}
