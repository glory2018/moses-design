package com.moses.design.pattern.composite.model.aggregates;

import com.moses.design.pattern.composite.model.vo.TreeNode;
import com.moses.design.pattern.composite.model.vo.TreeRoot;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

/**
 * 规则树聚合
 * 微信公众号：bugstack虫洞栈 | 专注原创技术专题案例
 * 论坛：http://bugstack.cn
 * Create by 付政委 on @2019
 */
@Getter
@Setter
public class TreeRich {
    private TreeRoot treeRoot;                          //树根信息
    private Map<Long, TreeNode> treeNodeMap;        //树节点ID -> 子节点

    public TreeRich(TreeRoot treeRoot, Map<Long, TreeNode> treeNodeMap) {
        this.treeRoot = treeRoot;
        this.treeNodeMap = treeNodeMap;
    }
}
