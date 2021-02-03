package com.moses.design.pattern.composite.model.vo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 决策结果
 *
 * @author Moses
 * @date 2021/02/03
 */
@NoArgsConstructor
@Getter
@Setter
public class EngineResult {
    private boolean isSuccess; //执行结果
    private String userId;   //用户ID
    private Long treeId;     //规则树ID
    private Long nodeId;   //果实节点ID
    private String nodeValue;//果实节点值

    public EngineResult(boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public EngineResult(String userId, Long treeId, Long nodeId, String nodeValue) {
        this.isSuccess = true;
        this.userId = userId;
        this.treeId = treeId;
        this.nodeId = nodeId;
        this.nodeValue = nodeValue;
    }
}
