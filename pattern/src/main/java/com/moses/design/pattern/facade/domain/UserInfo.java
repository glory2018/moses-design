package com.moses.design.pattern.facade.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 用户信息
 *
 * @author fanshaorong
 * @date 2021/02/03
 */
@Setter
@Getter
@NoArgsConstructor
public class UserInfo {
    //code、info可以统一定义一个类
    private String code;
    private String info;
    private String name;
    private Integer age;
    private String address;

    public UserInfo(String code, String info) {
        this.code = code;
        this.info = info;
    }

    public UserInfo(String name, Integer age, String address) {
        this.code = "0000";
        this.info = "success";
        this.name = name;
        this.age = age;
        this.address = address;
    }
}
