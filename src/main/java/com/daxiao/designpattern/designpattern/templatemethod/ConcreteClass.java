package com.daxiao.designpattern.designpattern.templatemethod;

/**
 * @ description:
 * @ author: daxiao
 * @ date: 2021/5/16
 */
public class ConcreteClass extends AbstractClass{
    @Override
    public void methodToExtend1() {
        System.out.println("subclass implement");
    }

    @Override
    public void methodToExtend2() {
        System.out.println("subclass implement");
    }

    public static void main(String[] args) {
        AbstractClass abstractClass = new ConcreteClass();
        abstractClass.templateMethod();
    }
}
