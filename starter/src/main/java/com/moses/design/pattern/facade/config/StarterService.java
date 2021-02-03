package com.moses.design.pattern.facade.config;

import org.springframework.util.StringUtils;

/**
 * @author fanshaorong
 * @date 2021/02/03
 */
public class StarterService {
    private String userStr;

    public StarterService(String userStr) {
        this.userStr = userStr;
    }

    public String[] split(String separatorChar) {
        return StringUtils.split(this.userStr, separatorChar);
    }
}
