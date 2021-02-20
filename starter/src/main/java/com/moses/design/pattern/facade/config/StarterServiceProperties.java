package com.moses.design.pattern.facade.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 切面定义
 *
 * @author fanshaorong
 * @date 2021/02/03
 */
@Setter
@Getter
@ConfigurationProperties("moses.door")
public class StarterServiceProperties {
    private String userStr;
}
