package com.moses.design.pattern.mediator.session;

import java.io.Closeable;
import java.util.List;

public interface SqlSession extends Closeable {
    /**
     * Retrieve a single row mapped from the statement key.
     *
     * @param <T>       the returned object type
     * @param statement the statement
     * @return Mapped object
     */
    <T> T selectOne(String statement);

    <T> T selectOne(String statement, Object parameter);

    <E> List<E> selectList(String statement);

    <E> List<E> selectList(String statement, Object parameter);

    @Override
    void close();
}
