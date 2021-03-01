package com.moses.design.gofex.builder;

/**
 * 饮料
 * @author adamjwh
 *
 */
public abstract class Drink implements Item {

	@Override
	public Packing packing() {
		return new Bottle();
	}
	
	@Override
	public abstract float getPrice();
	
}
