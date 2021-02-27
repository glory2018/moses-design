package com.moses.design.pattern.iterator.group;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * 雇员
 */
@Setter
@Getter
@AllArgsConstructor
public class Employee {
    private String uId;   // ID
    private String name;  // 姓名
    private String desc;  // 备注
}
