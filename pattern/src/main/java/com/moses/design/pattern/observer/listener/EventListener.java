package com.moses.design.pattern.observer.listener;

import com.moses.design.pattern.observer.LotteryResult;

public interface EventListener {
    void doEvent(LotteryResult result);
}
