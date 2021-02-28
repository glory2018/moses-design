package com.moses.design.pattern.test.iterator;

import com.moses.design.pattern.iterator.group.Employee;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest {
    private Logger logger = LoggerFactory.getLogger(MapTest.class);

    @Test
    public void test_iterator() {
        Map<String, Employee> map = new HashMap<>();
        map.put("1", new Employee("1", "小傅哥", "一级部门"));
        map.put("2", new Employee("2", "花花", "二级部门"));
        map.put("3", new Employee("3", "豆包", "二级部门"));
        map.put("4", new Employee("4", "蹦蹦", "三级部门"));
        map.put("5", new Employee("5", "大烧", "三级部门"));
        map.put("6", new Employee("6", "虎哥", "四级部门"));
        map.put("7", new Employee("7", "玲姐", "四级部门"));
        map.put("8", new Employee("8", "秋雅", "四级部门"));
        Iterator<Map.Entry<String, Employee>> entries = map.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<String, Employee> entry = entries.next();
            Employee employee = entry.getValue();
            logger.info("{}，雇员 Id：{} Name：{}", employee.getDesc(), employee.getUId(), employee.getName());
        }
    }
}
