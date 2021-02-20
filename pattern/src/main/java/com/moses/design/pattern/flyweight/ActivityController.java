package com.moses.design.pattern.flyweight;

import com.moses.design.pattern.flyweight.util.RedisUtils;

/**
 * 活动控制类
 *
 * @author fanshaorong
 * @date 2021/02/03
 */
public class ActivityController {
    private RedisUtils redisUtils = new RedisUtils();

    public Activity queryActivityInfo(Long id) {
        Activity activity = ActivityFactory.getActivity(id);
        // 模拟从Redis中获取库存变化信息
        Stock stock = new Stock(1000, redisUtils.getStockUsed());
        activity.setStock(stock);
        return activity;
    }
}
