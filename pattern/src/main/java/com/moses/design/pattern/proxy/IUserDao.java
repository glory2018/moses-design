package com.moses.design.pattern.proxy;

import com.moses.design.pattern.proxy.agent.Select;

public interface IUserDao {
    @Select("select userName from user where id = #{uId}")
    String queryUserInfo(String uId);
}
