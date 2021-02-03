package com.moses.design.pattern.builder;

import com.moses.design.pattern.builder.base.Matter;

/**
 * 菜单
 *
 * @author Moses
 * @date 2021/02/03
 */
public interface IMenu {
    /**
     * 吊顶
     */
    IMenu appendCeiling(Matter matter);

    /**
     * 涂料
     */
    IMenu appendCoat(Matter matter);

    /**
     * 地板
     */
    IMenu appendFloor(Matter matter);

    /**
     * 地砖
     */
    IMenu appendTile(Matter matter);

    /**
     * 明细
     */
    String getDetail();
}
