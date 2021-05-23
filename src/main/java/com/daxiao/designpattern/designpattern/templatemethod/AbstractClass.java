package com.daxiao.designpattern.designpattern.templatemethod;

/**
 * @ description:
 * @ author: daxiao
 * @ date: 2021/5/16
 */
public abstract class AbstractClass {

    public final void templateMethod() {
        // 这里是已经定义好的模版
        // 两个抽象方法就是两个扩展点
        methodToExtend1();
        methodToExtend2();
    }

    public abstract void methodToExtend1();

    public abstract void methodToExtend2();
}
