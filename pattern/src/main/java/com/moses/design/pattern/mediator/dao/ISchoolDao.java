package com.moses.design.pattern.mediator.dao;

import com.moses.design.pattern.mediator.po.School;

public interface ISchoolDao {
    School querySchoolInfoById(Long treeId);
}
