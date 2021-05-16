package com.daxiao.designpattern.designpattern.observer;

import java.util.LinkedList;
import java.util.List;

/**
 * @ description:
 * @ author: daxiao
 * @ date: 2021/5/16
 */
public class SubjectImpl implements Subject{

    /** 观察者 */
    private final List<Observer> observers = new LinkedList<>();


    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObersers(Message message) {
        // 将消息通知给所有的观察者 此时为同步阻塞
        for (Observer observer : observers) {
            observer.update(message);
        }
    }


    public static void main(String[] args) {
        Subject subject = new SubjectImpl();
        subject.registerObserver(new ObserverImpl1());
        subject.registerObserver(new ObserverImpl2());
        subject.notifyObersers(new Message());
    }
}
