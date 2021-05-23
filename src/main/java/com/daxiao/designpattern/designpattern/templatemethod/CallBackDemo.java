package com.daxiao.designpattern.designpattern.templatemethod;

/**
 * @ description:
 * @ author: daxiao
 * @ date: 2021/5/16
 */
public class CallBackDemo {

    public static void main(String[] args) {
        B b = new B();
        b.process(() -> System.out.println("callback method invoked"));
    }
}

class B {
    public void process(ICallBack callBack) {
        // do something
        callBack.callBackMethod();
        // do something
    }
}