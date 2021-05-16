package com.daxiao.designpattern.designpattern.singleton;

import java.util.concurrent.atomic.AtomicLong;

/**
 * inner static class
 * @ description:
 * @ author: daxiao
 * @ date: 2021/5/1
 */
public class IdGenerator4 implements IdGenerator{

    private final AtomicLong atomicLong = new AtomicLong(0);

    private IdGenerator4() {}

    private static class ResourceHolder {
        private static final IdGenerator4 INSTANCE = new IdGenerator4();
    }

    public static IdGenerator4 getInstance() {
        return ResourceHolder.INSTANCE;
    }

    @Override
    public long getId() {
        return atomicLong.incrementAndGet();
    }
}
