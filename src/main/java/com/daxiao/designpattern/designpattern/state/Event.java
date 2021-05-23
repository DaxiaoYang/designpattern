package com.daxiao.designpattern.designpattern.state;

/**
 * @ description:
 * @ author: daxiao
 * @ date: 2021/5/18
 */
public enum Event {
    GOT_MUSHROOM(0),
    GOT_CAPE(0),
    GOT_FIRE(0),
    MET_MONSTER(0);

    private int value;

    Event(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
