package com.daxiao.designpattern.designpattern.resposibilitychain;

/**
 * @ description:
 * @ author: daxiao
 * @ date: 2021/5/17
 */
public class Handler2 extends AbstractHandler{
    @Override
    protected boolean doHandle() {
        System.out.println("handler2 process...");
        return true;
    }
}
