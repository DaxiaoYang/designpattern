package com.daxiao.designpattern.designpattern.observer;

import com.google.common.eventbus.Subscribe;

/**
 * @ description:
 * @ author: daxiao
 * @ date: 2021/5/16
 */
public class PromotionRegObserver implements RegObserver{

    @Subscribe
    @Override
    public void handleRegSuccess(Long userId) {
        System.out.println("promote");
    }
}
