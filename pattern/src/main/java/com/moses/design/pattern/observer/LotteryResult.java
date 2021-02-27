package com.moses.design.pattern.observer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
public class LotteryResult {
    private String uId;    // 用户ID
    private String msg;    // 摇号信息
    private Date dateTime; // 业务时间
}
