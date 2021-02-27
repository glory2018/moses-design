package com.moses.design.pattern.test.mediator;

import com.alibaba.fastjson.JSON;
import com.moses.design.pattern.mediator.po.User;
import com.moses.design.pattern.mediator.session.Resources;
import com.moses.design.pattern.mediator.session.SqlSession;
import com.moses.design.pattern.mediator.session.SqlSessionFactory;
import com.moses.design.pattern.mediator.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Reader;
import java.util.List;

public class ApiTest {
    private Logger logger = LoggerFactory.getLogger(ApiTest.class);

    @Test
    public void test_queryUserInfoById() {
        query("com.moses.design.pattern.mediator.dao.IUserDao.queryUserInfoById", 1L);
    }

    @Test
    public void test_queryUserList() {
        User req = new User();
        req.setAge(18);
        query("com.moses.design.pattern.mediator.dao.IUserDao.queryUserList", req);
    }

    private void query(String sql, Object param) {
        String resource = "mybatis-config-datasource.xml";
        Reader reader;
        try {
            reader = Resources.getResourceAsReader(resource);
            SqlSessionFactory sqlMapper = new SqlSessionFactoryBuilder().build(reader);
            SqlSession session = sqlMapper.openSession();
            try {
                List<User> userList = session.selectList(sql, param);
                logger.info("测试结果：{}", JSON.toJSONString(userList));
            } finally {
                session.close();
                reader.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
