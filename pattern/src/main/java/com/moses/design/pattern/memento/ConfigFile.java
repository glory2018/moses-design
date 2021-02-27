package com.moses.design.pattern.memento;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * 配置文件
 */
@Setter
@Getter
@AllArgsConstructor
public class ConfigFile {
    private String versionNo; // 版本号
    private String content;   // 内容
    private Date dateTime;    // 时间
    private String operator;  // 操作人
}
