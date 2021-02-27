package com.moses.design.pattern.test.memento;

import com.alibaba.fastjson.JSON;
import com.moses.design.pattern.memento.Admin;
import com.moses.design.pattern.memento.ConfigFile;
import com.moses.design.pattern.memento.ConfigMemento;
import com.moses.design.pattern.memento.ConfigOriginator;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

public class ApiTest {
    private Logger logger = LoggerFactory.getLogger(ApiTest.class);
    Admin admin = new Admin();
    ConfigOriginator configOriginator = new ConfigOriginator();

    @Test
    public void test() {
        add("1000001", "配置内容A=11");
        add("1000002", "配置内容B=22");
        add("1000003", "配置内容C=33");
        add("1000004", "配置内容D=44");
        add("1000005", "配置内容C=55");
        add("1000006", "配置内容D=66");
        // 历史配置(回滚)
        print(admin.undo(), "历史配置(回滚)undo：{}");
        // 历史配置(回滚)
        print(admin.undo(), "历史配置(回滚)undo：{}");
        // 历史配置(前进)
        print(admin.redo(), "历史配置(前进)undo：{}");
        // 历史配置(获取)
        print(admin.get("1000002"), "历史配置(获取)undo：{}");
    }

    private void print(ConfigMemento memento, String msg) {
        configOriginator.getMemento(memento);
        logger.info(msg, JSON.toJSONString(configOriginator.getConfigFile()));
    }

    private void add(String versionNo, String content) {
        configOriginator.setConfigFile(new ConfigFile(versionNo, content, new Date(), "小傅哥"));
        admin.append(configOriginator.saveMemento()); // 保存配置
    }
}
