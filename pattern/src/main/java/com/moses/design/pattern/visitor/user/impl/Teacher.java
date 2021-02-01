package com.moses.design.pattern.visitor.user.impl;

import com.moses.design.pattern.visitor.user.User;
import com.moses.design.pattern.visitor.visitor.Visitor;

import java.math.BigDecimal;

// 老师
public class Teacher extends User {
    public Teacher(String name, String identity, String clazz) {
        super(name, identity, clazz);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    // 升本率
    public double entranceRatio() {
        return BigDecimal.valueOf(Math.random() * 100).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
    }
}
