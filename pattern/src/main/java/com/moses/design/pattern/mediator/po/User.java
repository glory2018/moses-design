package com.moses.design.pattern.mediator.po;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class User {
    private Long id;
    private String name;
    private Integer age;
    private Date createTime;
    private Date updateTime;
}
