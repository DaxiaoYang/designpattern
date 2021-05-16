package com.daxiao.designpattern.designpattern.proxy.staticproxy;

/**
 * @ description:
 * @ author: daxiao
 * @ date: 2021/5/13
 * 继承实现静态代理
 */
public class UserProxyExtend extends User {

    @Override
    public void doSomething() {
        System.out.println("代理类实现其他非业务功能逻辑");
        super.doSomething();
        System.out.println("代理类实现其他非业务功能逻辑");
    }
}
