package com.moses.design.pattern.composite.service.engine;

import com.moses.design.pattern.composite.model.aggregates.TreeRich;
import com.moses.design.pattern.composite.model.vo.EngineResult;

import java.util.Map;

public interface IEngine {
    EngineResult process(final Long treeId, final String userId, TreeRich treeRich, final Map<String, String> decisionMatter);
}
