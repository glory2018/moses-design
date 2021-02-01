package com.moses.design.pattern.visitor.visitor.impl;

import com.moses.design.pattern.visitor.user.impl.Student;
import com.moses.design.pattern.visitor.user.impl.Teacher;
import com.moses.design.pattern.visitor.visitor.Visitor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// 校长
public class Principal implements Visitor {
    private Logger logger = LoggerFactory.getLogger(Principal.class);

    @Override
    public void visit(Student student) {
        logger.info("学生信息 姓名：{} 班级：{}", student.name, student.clazz);
    }

    @Override
    public void visit(Teacher teacher) {
        logger.info("学生信息 姓名：{} 班级：{} 升学率：{}", teacher.name, teacher.clazz, teacher.entranceRatio());
    }
}
