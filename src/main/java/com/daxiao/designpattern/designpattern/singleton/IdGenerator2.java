package com.daxiao.designpattern.designpattern.singleton;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 懒汉式
 */
public class IdGenerator2 implements IdGenerator {

    private final AtomicLong atomicLong = new AtomicLong(0);

    private static IdGenerator2 INSTANCE;

    private IdGenerator2() {}

    public static synchronized IdGenerator2 getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new IdGenerator2();
        }
        return INSTANCE;
    }

    @Override
    public long getId() {
        return atomicLong.incrementAndGet();
    }
}
