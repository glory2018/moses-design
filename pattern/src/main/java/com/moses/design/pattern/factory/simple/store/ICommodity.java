package com.moses.design.pattern.factory.simple.store;

import java.util.Map;

/**
 * 发奖接口
 *
 * @author Moses
 * @date 2021/2/1
 */
public interface ICommodity {
    void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception;
}
