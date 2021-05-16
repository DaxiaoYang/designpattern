package com.daxiao.designpattern.designpattern.observer;

/**
 * @ description:
 * @ author: daxiao
 * @ date: 2021/5/16
 */
public class ObserverImpl1 implements Observer{
    @Override
    public void update(Message message) {
        System.out.println("observer1 get notification");
    }
}
