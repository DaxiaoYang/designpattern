package com.daxiao.designpattern.distruptor.longEvent;

import com.lmax.disruptor.BlockingWaitStrategy;
import com.lmax.disruptor.RingBuffer;
import com.lmax.disruptor.WorkHandler;
import com.lmax.disruptor.dsl.Disruptor;
import com.lmax.disruptor.dsl.ProducerType;
import com.lmax.disruptor.util.DaemonThreadFactory;

import java.util.concurrent.ThreadFactory;

/**
 * @ description:
 * @ author: daxiao
 * @ date: 2021/8/7
 */
public class DistruptorMain {

    public static void main(String[] args) {

        Disruptor<LongHolder> disruptor = new Disruptor<>(LongHolder::new, 1024,
                (ThreadFactory) Thread::new,
                ProducerType.MULTI,
                new BlockingWaitStrategy());
//        disruptor.handleEventsWith(DistruptorMain::handleLong, DistruptorMain::handleLong2);
        disruptor.handleEventsWithWorkerPool(new LongHandler(), new LongHandler());
        disruptor.start();
        RingBuffer<LongHolder> ringBuffer = disruptor.getRingBuffer();
        new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                ringBuffer.publishEvent(DistruptorMain::translate, (long)i);
            }
        }).start();

        new Thread(() -> {
            for (int i = 10000; i < 20000; i++) {
                ringBuffer.publishEvent(DistruptorMain::translate, (long)i);
            }
        }).start();
        new Thread(() -> {
            for (int i = 20000; i < 30000; i++) {
                ringBuffer.publishEvent(DistruptorMain::translate, (long)i);
            }
        }).start();
    }

    private static class LongHandler implements WorkHandler<LongHolder> {

        @Override
        public void onEvent(LongHolder event) throws Exception {
            System.out.println(event.getValue());
        }
    }


    public static void handleLong(LongHolder event, long sequence, boolean endOfBatch) {
        if (sequence % 2 == 0) {
            System.out.println(event.getValue());
        }
    }

    public static void handleLong2(LongHolder event, long sequence, boolean endOfBatch) {
        if (sequence % 2 == 1) {
            System.out.println(event.getValue());
        }
    }

    public static void translate (LongHolder event, long sequence, long value) {
        event.setValue(value);
    }
}
