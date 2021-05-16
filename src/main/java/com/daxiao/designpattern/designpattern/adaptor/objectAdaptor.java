package com.daxiao.designpattern.designpattern.adaptor;

/**
 * @ description:
 * @ author: daxiao
 * @ date: 2021/5/13
 * 对象适配器
 */
public class objectAdaptor implements ITarget{

    private Adaptee adaptee;

    public objectAdaptor(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void f1() {
        adaptee.fa();
    }

    @Override
    public void f2() {
        System.out.println("enhance method");
        adaptee.fb();
    }

    @Override
    public void fc() {
        adaptee.fc();
    }
}
