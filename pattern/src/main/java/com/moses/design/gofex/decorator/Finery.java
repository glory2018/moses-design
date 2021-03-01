package com.moses.design.gofex.decorator;

/**
 * 服装类
 * @author adamjwh
 *
 */
public class Finery extends Person {

	protected Person component;
	
	public void Decorate(Person component) {
		this.component = component;
	}
	
	@Override
	public void show() {
		if(component != null) {
			component.show();
		}
	}
	
}
