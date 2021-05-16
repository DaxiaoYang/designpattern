package com.daxiao.designpattern.designpattern.singleton;

import java.util.concurrent.atomic.AtomicLong;

/**
 * DCL
 * @ description:
 * @ author: daxiao
 * @ date: 2021/5/1 6:54 上午
 * https://www.javacodemonk.com/threadsafe-singleton-design-pattern-java-806ad7e6
 */
public class IdGenerator3 implements IdGenerator {

    private final AtomicLong atomicLong = new AtomicLong(0);

    private IdGenerator3() {}

    private static volatile IdGenerator3 instance;

    public static IdGenerator3 getInstance() {
        IdGenerator3 temp = instance;
        if (temp == null) {
            synchronized (IdGenerator3.class) {
                if ((temp = instance) == null) {
                    instance = temp = new IdGenerator3();
                }
            }
        }
        return temp;
    }

    @Override
    public long getId() {
        return atomicLong.incrementAndGet();
    }
}
