package com.daxiao.designpattern.designpattern.proxy.staticproxy;

/**
 * @ description:
 * @ author: daxiao
 * @ date: 2021/5/13
 */
public class User implements IUser {
    @Override
    public void doSomething() {
        System.out.println("被代理类的行为");
    }
}
