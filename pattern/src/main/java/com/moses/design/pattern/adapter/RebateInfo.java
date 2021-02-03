package com.moses.design.pattern.adapter;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * 退税信息
 *
 * @author Moses
 * @date 2021/02/03
 */
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
