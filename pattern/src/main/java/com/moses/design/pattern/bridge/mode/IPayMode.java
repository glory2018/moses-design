package com.moses.design.pattern.bridge.mode;

/**
 * 付费模式
 *
 * @author Moses
 * @date 2021/02/03
 */
public interface IPayMode {
    boolean security(String uId);
}
