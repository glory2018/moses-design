package com.moses.design.pattern.mediator.session.defaults;

import com.moses.design.pattern.mediator.session.Configuration;
import com.moses.design.pattern.mediator.session.SqlSession;
import com.moses.design.pattern.mediator.session.SqlSessionFactory;

/**
 *
 */
public class DefaultSqlSessionFactory implements SqlSessionFactory {
    private final Configuration configuration;

    public DefaultSqlSessionFactory(Configuration configuration) {
        this.configuration = configuration;
    }

    @Override
    public SqlSession openSession() {
        return new DefaultSqlSession(configuration.connection, configuration.mapperElement);
    }
}
