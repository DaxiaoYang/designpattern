package com.daxiao.designpattern.designpattern.resposibilitychain;

/**
 * @ description:
 * @ author: daxiao
 * @ date: 2021/5/17
 * 职责链上的节点
 */
public abstract class AbstractHandler {

    protected AbstractHandler next;

    public void setNext(AbstractHandler next) {
        this.next = next;
    }

    /**
     * 模板方法
     */
    public final void handle() {
        boolean result = doHandle();
        if (result && next != null) {
            next.handle();
        }
    }

    protected abstract boolean doHandle();
}
