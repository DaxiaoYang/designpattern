package com.daxiao.designpattern.designpattern.state;

/**
 * @ description:
 * @ author: daxiao
 * @ date: 2021/5/18
 */
public enum State {

    SMALL(0),
    SUPER(1),
    FIRE(2),
    CAPE(3);

    private int value;

    State(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
