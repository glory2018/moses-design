package com.moses.design.pattern.flyweight;

import lombok.Getter;
import lombok.Setter;

/**
 * 库存
 *
 * @author fanshaorong
 * @date 2021/02/03
 */
@Setter
@Getter
public class Stock {
    private int total; // 库存总量
    private int used;  // 库存已用

    public Stock(int total, int used) {
        this.total = total;
        this.used = used;
    }
}
