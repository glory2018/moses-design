/**
 * @Title: Context.java
 * @Package com.adamjwh.gof.interpreter
 * @Description:
 * @author adamjwh
 * @date 2018年7月27日
 * @version V1.0
 */
package com.moses.design.gof.interpreter;

import lombok.Getter;
import lombok.Setter;

/**
 * @author adamjwh
 * @ClassName: Context
 * @Description: 环境角色
 * @date 2018年7月27日
 */
@Getter
@Setter
public class Context {
    private String input;
    private String output;
}
