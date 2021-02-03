package com.moses.design.pattern.composite.model.vo;

import lombok.Getter;
import lombok.Setter;

/**
 * 树根信息
 */
@Getter
@Setter
public class TreeRoot {
    private Long treeId;         //规则树ID
    private Long treeRootNodeId; //规则树根ID
    private String treeName;     //规则树名称
}
