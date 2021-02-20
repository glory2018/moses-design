package com.moses.design.pattern.responsibility.base;

import com.moses.design.pattern.responsibility.AuthInfo;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 模拟审核服务
 * 1. auth          审核流程
 * 2. queryAuthInfo 查询审核信息(时间)
 */
public class AuthService {
    private static Map<String, AuthInfo> authMap = new ConcurrentHashMap<String, AuthInfo>();

    /**
     * 添加认证信息
     *
     * @param uId      你的id
     * @param authInfo 审批信息
     */
    public static void auth(String uId, AuthInfo authInfo) {
        authMap.put(uId, authInfo);
    }

    /**
     * 查询认证信息
     *
     * @param uId 用户id
     * @return {@link AuthInfo}
     */
    public static AuthInfo queryAuthInfo(String uId) {
        return authMap.get(uId);
    }
}
