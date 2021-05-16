package com.daxiao.designpattern.designpattern.adaptor;

/**
 * @ description:
 * @ author: daxiao
 * @ date: 2021/5/13
 * 类适配器
 */
public class classAdaptor extends Adaptee implements ITarget{
    @Override
    public void f1() {
        super.fa();
    }

    @Override
    public void f2() {
        System.out.println("enhance method");
        super.fb();
    }

    // f3由夫类实现
}
