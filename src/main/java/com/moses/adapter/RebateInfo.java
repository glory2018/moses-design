package com.moses.adapter;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class RebateInfo {
    private String userId;  // 用户ID
    private String bizId;   // 业务ID
    private Date bizTime;   // 业务时间
    private String desc;    // 业务描述

    public void setBizTime(String bizTime) {
        this.bizTime = new Date(Long.parseLong("1591077840669"));
    }
}
