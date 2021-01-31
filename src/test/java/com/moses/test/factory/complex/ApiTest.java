package com.moses.test.factory.complex;

import com.moses.factory.complex.base.CacheService;
import com.moses.factory.complex.base.impl.CacheServiceImpl;
import com.moses.factory.complex.factory.JDKProxy;
import com.moses.factory.complex.factory.impl.EGMCacheAdapter;
import com.moses.factory.complex.factory.impl.IIRCacheAdapter;
import org.junit.Test;

public class ApiTest {
    @Test
    public void test_CacheService() throws Exception {
        CacheService proxy_EGM = JDKProxy.getProxy(CacheServiceImpl.class, new EGMCacheAdapter());
        proxy_EGM.set("user_name_01", "小傅哥");
        String val01 = proxy_EGM.get("user_name_01");
        System.out.println("测试结果：" + val01);
        CacheService proxy_IIR = JDKProxy.getProxy(CacheServiceImpl.class, new IIRCacheAdapter());
        proxy_IIR.set("user_name_01", "小傅哥");
        String val02 = proxy_IIR.get("user_name_01");
        System.out.println("测试结果：" + val02);
    }
}
