package com.moses.design.pattern.proxy.agent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.FactoryBean;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 映射器工厂bean
 * 代理类
 *
 * @author fanshaorong
 * @date 2021/02/04
 */
public class MapperFactoryBean<T> implements FactoryBean<T> {
    private Logger logger = LoggerFactory.getLogger(MapperFactoryBean.class);
    private Class<T> mapperInterface;

    public MapperFactoryBean(Class<T> mapperInterface) {
        this.mapperInterface = mapperInterface;
    }

    /**
     * 提供类的代理以及模拟对sql语句的处理
     *
     * @return {@link T}
     * @throws Exception 异常
     */
    @Override
    public T getObject() throws Exception {
        InvocationHandler handler = (proxy, method, args) -> {
            Select select = method.getAnnotation(Select.class);
            logger.info("SQL：{}", select.value().replace("#{uId}", args[0].toString()));
            return args[0] + ",小傅哥,bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！";
        };
        return (T) Proxy.newProxyInstance(this.getClass().getClassLoader(), new Class[]{mapperInterface}, handler);
    }

    /**
     * 提供对象类型反馈
     *
     * @return {@link Class<?>}
     */
    @Override
    public Class<?> getObjectType() {
        return mapperInterface;
    }

    /**
     * 是单例
     *
     * @return boolean
     */
    @Override
    public boolean isSingleton() {
        return true;
    }
}
