package com.moses.design.pattern.test.responsibility;

import com.moses.design.pattern.responsibility.AuthLink;
import com.moses.design.pattern.responsibility.impl.Level1AuthLink;
import com.moses.design.pattern.responsibility.impl.Level2AuthLink;
import com.moses.design.pattern.responsibility.impl.Level3AuthLink;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.ParseException;

public class ApiTest {
    private Logger logger = LoggerFactory.getLogger(ApiTest.class);

    private static AuthLink getChainOfAuth() {
        AuthLink generalManager = new Level1AuthLink("1000011", "段总");
        AuthLink projectManager = new Level2AuthLink("1000012", "张经理");
        AuthLink director = new Level3AuthLink("1000013", "王工");
        director.setNext(projectManager);
        projectManager.setNext(generalManager);
        return director;
    }

    @Test
    public void test_AuthLink() throws ParseException {
        AuthLink authChain = getChainOfAuth();
        authChain.doAuth(3, "小傅哥", "1000998004813441");
//        authChain.doAuth(2,"小傅哥", "1000998004813441");
//        authChain.doAuth(1,"小傅哥", "1000998004813441");
    }
}
