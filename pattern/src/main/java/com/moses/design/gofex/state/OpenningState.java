/**
 * @Title: OpenningState.java
 * @Package com.adamjwh.gofex.state
 * @Description:
 * @author adamjwh
 * @date 2018年5月30日
 * @version V1.0
 */
package com.moses.design.gofex.state;

/**
 * @ClassName: OpenningState
 * @Description: 敞门状态
 * @author adamjwh
 * @date 2018年5月30日
 *
 */
public class OpenningState extends LiftState {
    // * 执行打开电梯门方法
    @Override
    public void open() {
        System.out.println("电梯门开启");
    }

    //打开后还可以关闭电梯门
    @Override
    public void close() {
        //状态修改
        super.context.setLiftState(Context.CLOSING_STATE);
        //动作委托为CLOSING_STATE执行
        super.context.getLiftState().close();
    }

    //门开着不能运行
    @Override
    public void run() {
        //什么都不做
    }

    //门开着已经停止了
    @Override
    public void stop() {
        //什么都不做
    }
}
