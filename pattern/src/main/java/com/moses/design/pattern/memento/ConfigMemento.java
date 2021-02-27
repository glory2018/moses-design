package com.moses.design.pattern.memento;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * 配置文件备忘录
 */
@Setter
@Getter
@AllArgsConstructor
public class ConfigMemento {
    private ConfigFile configFile;
}
