package com.moses.design.pattern.visitor.visitor;

import com.moses.design.pattern.visitor.user.impl.Student;
import com.moses.design.pattern.visitor.user.impl.Teacher;

public interface Visitor {
    // 访问学生信息
    void visit(Student student);

    // 访问老师信息
    void visit(Teacher teacher);
}
