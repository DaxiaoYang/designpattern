package com.daxiao.designpattern.designpattern.observer;

import com.google.common.eventbus.AsyncEventBus;
import com.google.common.eventbus.EventBus;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * @ description:
 * @ author: daxiao
 * @ date: 2021/5/16
 */
public class UserControllerWithEventBus {

    private EventBus eventBus;

    public void setObserver(List<Object> observers) {
        observers.forEach(eventBus::register);
    }

    public UserControllerWithEventBus() {
//        同步阻塞
//        this.eventBus = new EventBus();
        this.eventBus = new AsyncEventBus(Executors.newFixedThreadPool(20));
    }

    public long register() {
        long generatedId = 1;
        setObserver(Arrays.asList(new NotificationRegObserver(), new PromotionRegObserver()));
        eventBus.post(generatedId);
        return generatedId;
    }

    public static void main(String[] args) {
        UserControllerWithEventBus userControllerWithEventBus = new UserControllerWithEventBus();
        userControllerWithEventBus.register();
    }
}
