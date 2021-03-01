/**
 * @Title: ConcreteHandlerC.java
 * @Package com.adamjwh.gof.chain_of_responsibility
 * @Description: 
 * @author adamjwh
 * @date 2018年7月27日
 * @version V1.0
 */
package com.moses.design.gof.chain_of_responsibility;

/**
 * @ClassName: ConcreteHandlerC
 * @Description: 具体处理者C
 * @author adamjwh
 * @date 2018年7月27日
 *
 */
public class ConcreteHandlerC extends Handler {

	@Override
	protected Level getHandlerLevel() {
		//设置自己的处理级别
		return null;
	}

	@Override
	protected Response echo(Request request) {
		//完成处理逻辑
		return null;
	}

}
