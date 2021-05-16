package com.daxiao.designpattern.designpattern.singleton;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @ description:
 * @ author: daxiao
 * @ date: 2021/5/1
 */
public enum IdGenerator5 implements IdGenerator{

    INSTANCE;

    private final AtomicLong atomicLong = new AtomicLong(0);

    @Override
    public long getId() {
        return atomicLong.incrementAndGet();
    }


    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(IdGenerator4.getInstance().getId());
            }).start();
        }
    }
}
