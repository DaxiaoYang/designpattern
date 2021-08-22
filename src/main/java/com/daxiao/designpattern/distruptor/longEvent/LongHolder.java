package com.daxiao.designpattern.distruptor.longEvent;

/**
 * @ description:
 * @ author: daxiao
 * @ date: 2021/8/7
 */
public class LongHolder {

    private long value;

    public void setValue(long value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "LongHolder{" +
                "value=" + value +
                '}';
    }

    public long getValue() {
        return value;
    }
}
