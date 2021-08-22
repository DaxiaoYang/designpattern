package com.daxiao.designpattern.distruptor.logevent;

import com.lmax.disruptor.EventHandler;

/**
 * @ description:
 * @ author: daxiao
 * @ date: 2021/8/7
 */
public class LogInfoConsumer implements EventHandler<LogEvent> {
    @Override
    public void onEvent(LogEvent logEvent, long l, boolean b) throws Exception {
        System.out.println(logEvent);
    }
}
