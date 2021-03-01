package com.moses.design.gof.composite2;

/**
 * 对象声明接口
 * @author adamjwh
 *
 */
public abstract class Component {
	
	protected String name;
	
	public Component(String name) {
		this.name = name;
	}

	//获取分支下的所有叶子构件和树枝构件
	public abstract void display(int depth);
	
}
