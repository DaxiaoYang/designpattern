package com.daxiao.designpattern.designpattern.resposibilitychain;

import java.util.Objects;

/**
 * @ description:
 * @ author: daxiao
 * @ date: 2021/5/17
 */
public class HandlerChain {

    private AbstractHandler head;

    private AbstractHandler tail;

    public void addHandler(AbstractHandler handler) {
        Objects.requireNonNull(handler);
        handler.setNext(null);
        if (head == null) {
            head = handler;
            tail = handler;
            return;
        }
        tail.setNext(handler);
        tail = handler;
    }

    public void handle() {
        if (head != null) {
            head.handle();
        }
    }

    public static void main(String[] args) {
        HandlerChain chain = new HandlerChain();
        chain.addHandler(new Handler1());
        chain.addHandler(new Handler2());
        chain.handle();
    }
}
