package com.moses.design.pattern.composite.model.vo;

import lombok.Getter;
import lombok.Setter;

/**
 * 规则树线信息
 */
@Getter
@Setter
public class TreeNodeLink {
    private Long nodeIdFrom;        //节点From
    private Long nodeIdTo;          //节点To
    private Integer ruleLimitType;  //限定类型；1:=;2:>;3:<;4:>=;5<=;6:enum[枚举范围]
    private String ruleLimitValue;  //限定值
}
