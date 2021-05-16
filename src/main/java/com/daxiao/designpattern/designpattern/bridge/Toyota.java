package com.daxiao.designpattern.designpattern.bridge;

/**
 * @ description:
 * @ author: daxiao
 * @ date: 2021/5/13
 */
public class Toyota extends AbstractCar{
    public Toyota(AbstractTransmission transmission) {
        super(transmission);
    }

    @Override
    public void run() {
        System.out.println("run");
    }
}
