package com.moses.design.pattern.visitor.user.impl;

import com.moses.design.pattern.visitor.user.User;
import com.moses.design.pattern.visitor.visitor.Visitor;

// 学生
public class Student extends User {
    public Student(String name, String identity, String clazz) {
        super(name, identity, clazz);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public int ranking() {
        return (int) (Math.random() * 100);
    }
}
