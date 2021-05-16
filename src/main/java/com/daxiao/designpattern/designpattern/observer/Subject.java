package com.daxiao.designpattern.designpattern.observer;

/**
 * @ description:
 * @ author: daxiao
 * @ date: 2021/5/16
 * 被观察者
 */
public interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObersers(Message message);
}
