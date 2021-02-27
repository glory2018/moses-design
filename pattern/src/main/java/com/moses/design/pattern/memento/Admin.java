package com.moses.design.pattern.memento;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Admin {
    private int cursorIdx = 0;
    private List<ConfigMemento> mementoList = new ArrayList<ConfigMemento>();
    private Map<String, ConfigMemento> mementoMap = new ConcurrentHashMap<String, ConfigMemento>();

    /**
     * 存放
     */
    public void append(ConfigMemento memento) {
        mementoList.add(memento);
        mementoMap.put(memento.getConfigFile().getVersionNo(), memento);
        if (mementoList.size() > 1) {
            cursorIdx++;
        }
    }

    /**
     * 回滚
     *
     * @return {@link ConfigMemento}
     */
    public ConfigMemento undo() {
        if (--cursorIdx <= 0) {
            return mementoList.get(0);
        }
        return mementoList.get(cursorIdx);
    }

    /**
     * 返回
     *
     * @return {@link ConfigMemento}
     */
    public ConfigMemento redo() {
        if (++cursorIdx > mementoList.size()) {
            return mementoList.get(mementoList.size() - 1);
        }
        return mementoList.get(cursorIdx);
    }

    /**
     * 定向获取
     *
     * @param versionNo 版本
     * @return {@link ConfigMemento}
     */
    public ConfigMemento get(String versionNo) {
        return mementoMap.get(versionNo);
    }
}
