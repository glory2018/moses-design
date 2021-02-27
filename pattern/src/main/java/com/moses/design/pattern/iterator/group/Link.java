package com.moses.design.pattern.iterator.group;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * 树节点链路
 */
@Setter
@Getter
@AllArgsConstructor
public class Link {
    private String fromId; // 雇员ID
    private String toId;   // 雇员ID
}
