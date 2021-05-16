package com.daxiao.designpattern.designpattern.singleton;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 饿汉式单例
 */
public class IdGenerator1 implements IdGenerator {

    private final AtomicLong atomicLong = new AtomicLong(0);

    private IdGenerator1() {}

    private static final IdGenerator1 INSTANCE = new IdGenerator1();

    public static IdGenerator1 getInstance() {
        return INSTANCE;
    }

    @Override
    public long getId() {
        return atomicLong.incrementAndGet();
    }
}
