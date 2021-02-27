package com.moses.design.pattern.memento;

import lombok.Getter;
import lombok.Setter;

/**
 * 记录者
 *
 * @author fanshaorong
 * @date 2021/02/22
 */
@Setter
@Getter
public class ConfigOriginator {
    private ConfigFile configFile;

    public ConfigMemento saveMemento() {
        return new ConfigMemento(configFile);
    }

    public void getMemento(ConfigMemento memento) {
        this.configFile = memento.getConfigFile();
    }
}
