package com.moses.design.pattern.state.base;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class ActivityInfo {
    private String activityId;    // 活动ID
    private String activityName;  // 活动名称
    private Enum<Status> status;  // 活动状态
    private Date beginTime;       // 开始时间
    private Date endTime;         // 结束时间
}
