package com.moses.design.pattern.composite.model.aggregates;

import com.moses.design.pattern.composite.model.vo.TreeNode;
import com.moses.design.pattern.composite.model.vo.TreeRoot;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

/**
 * 规则树聚合
 *
 * @author Moses
 * @date 2021/02/03
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
