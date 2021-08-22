package com.daxiao.designpattern.distruptor.longEvent;

import com.lmax.disruptor.EventHandler;

/**
 * @ description:
 * @ author: daxiao
 * @ date: 2021/8/7
 */
public class LongConsumer implements EventHandler<LongHolder> {
    @Override
    public void onEvent(LongHolder longHolder, long l, boolean b) throws Exception {
        System.out.println(longHolder);
    }
}
