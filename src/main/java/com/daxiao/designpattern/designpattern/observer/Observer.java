package com.daxiao.designpattern.designpattern.observer;

/**
 * @ description:
 * @ author: daxiao
 * @ date: 2021/5/16
 * 观察者
 */
public interface Observer {
    /**
     * 观察者接受到消息 执行相关逻辑
     * @param message 消息
     */
    void update(Message message);
}
