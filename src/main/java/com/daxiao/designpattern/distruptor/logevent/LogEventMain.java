package com.daxiao.designpattern.distruptor.logevent;

import com.lmax.disruptor.RingBuffer;
import com.lmax.disruptor.dsl.Disruptor;
import com.lmax.disruptor.util.DaemonThreadFactory;

import java.util.Arrays;

/**
 * @ description:
 * @ author: daxiao
 * @ date: 2021/8/7
 */
public class LogEventMain {

    public static void main(String[] args) {
        int bufferSize = 1024;
        Disruptor<LogEvent> disruptor = new Disruptor<>(LogEvent::new, bufferSize, DaemonThreadFactory.INSTANCE);
        disruptor.handleEventsWith(new LogInfoConsumer());
        disruptor.start();

        RingBuffer<LogEvent> ringBuffer = disruptor.getRingBuffer();
        for (int i = 0; i < 100; i++) {
            ringBuffer.publishEvent(((logEvent, l, o) -> {
                logEvent.setList(Arrays.asList(new LogList(), new LogList()));
            }));
        }
    }
}
