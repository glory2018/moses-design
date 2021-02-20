package com.moses.design.pattern.flyweight;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @author fanshaorong
 * @date 2021/02/03
 */
@Setter
@Getter
public class Activity {
    private Long id;        // 活动ID
    private String name;    // 活动名称
    private String desc;    // 活动描述
    private Date startTime; // 开始时间
    private Date stopTime;  // 结束时间
    private Stock stock;    // 活动库存
}
