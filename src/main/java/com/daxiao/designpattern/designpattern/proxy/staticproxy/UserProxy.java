package com.daxiao.designpattern.designpattern.proxy.staticproxy;

/**
 * @ description:
 * @ author: daxiao
 * @ date: 2021/5/13
 * 组合实现静态代理：被代理类需要实现某个接口 且被代理的方法在接口里面 基于接口而非实现编程
 */
public class UserProxy implements IUser {

    private IUser proxyee;

    /**
     * 依赖注入
     * @param proxyee 被代理类
     */
    public UserProxy(IUser proxyee) {
        this.proxyee = proxyee;
    }

    @Override
    public void doSomething() {
        System.out.println("代理类实现其他非业务功能逻辑");
        proxyee.doSomething();
        System.out.println("代理类实现其他非业务功能逻辑");
    }

    public static void main(String[] args) {
        IUser proxyee = new UserProxy(new User());
        proxyee.doSomething();
    }
}
