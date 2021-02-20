package com.moses.design.pattern.facade.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author fanshaorong
 * @date 2021/02/03
 */
@Configuration
@ConditionalOnClass(StarterService.class)
@EnableConfigurationProperties(StarterServiceProperties.class)
public class StarterAutoConfigure {
    @Autowired
    private StarterServiceProperties properties;

    /**
     * 获取服务
     * prefix 节点前缀
     * value 属性值
     * havingValue 目标值
     * 属性值不为空，与havingValue指定的值一致则生效
     *
     * @return {@link StarterService}
     */
    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(prefix = "moses.door", name = "enabled", havingValue = "true")
    StarterService getService() {
        return new StarterService(properties.getUserStr());
    }
}