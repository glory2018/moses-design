package com.moses.adapter.base.mq;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * 内部订单MQ
 */
@Setter
@Getter
public class InsideOrder {
    private String uid;           // 用户ID
    private String sku;           // 商品
    private String orderId;       // 订单ID
    private Date createOrderTime; // 下单时间
}
