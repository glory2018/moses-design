package com.moses.design.pattern.responsibility;

import lombok.Getter;
import lombok.Setter;

/**
 * 身份验证信息
 *
 * @author fanshaorong
 * @date 2021/02/05
 */
@Setter
@Getter
public class AuthInfo {
    private String status;
    private String info = "";

    public AuthInfo(String status, String... infos) {
        this.status = status;
        for (String str : infos) {
            this.info = this.info.concat(str);
        }
    }
}
