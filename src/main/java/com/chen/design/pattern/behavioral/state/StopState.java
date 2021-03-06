package com.chen.design.pattern.behavioral.state;

/**
 * 停止状态
 *
 * @Author LeifChen
 * @Date 2018-11-19
 */
public class StopState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("当前状态：" + this.toString());
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Stop State";
    }
}
