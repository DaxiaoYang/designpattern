package com.daxiao.designpattern.designpattern.observer;

/**
 * @ description:
 * @ author: daxiao
 * @ date: 2021/5/16
 */
public class ObserverImpl2 implements Observer{
    @Override
    public void update(Message message) {
        System.out.println("observer2 get notification");
    }
}
