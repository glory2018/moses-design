package com.moses.design.pattern.mediator.dao;

import com.moses.design.pattern.mediator.po.User;

public interface IUserDao {
    User queryUserInfoById(Long id);
}
