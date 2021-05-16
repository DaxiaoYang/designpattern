package com.daxiao.designpattern.designpattern.observer;

import java.util.LinkedList;
import java.util.List;

/**
 * @ description:
 * @ author: daxiao
 * @ date: 2021/5/16
 */
public class UserController {

    private List<RegObserver> regObservers = new LinkedList<>();

    public void setRegObservers(List<RegObserver> regObservers) {
        this.regObservers = regObservers;
    }

    public void register() {
        // a user has been registered
        long generatedId = 1;
        // 同步阻塞的方式实现观察者模式 一个事件发生了 通知多个注册的观察者
        for (RegObserver regObserver : regObservers) {
            regObserver.handleRegSuccess(generatedId);
        }
    }
}

