package com.moses.design.pattern.mediator.po;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class School {
    private Long id;
    private String name;
    private String address;
    private Date createTime;
    private Date updateTime;
}
