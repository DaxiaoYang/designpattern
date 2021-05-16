package com.daxiao.designpattern.designpattern.bridge;

/**
 * @ description:
 * @ author: daxiao
 * @ date: 2021/5/13
 * 桥接模式：组合优于继承
 * 两个变化的纬度 变成两个抽象类 独立变化 通过组合结合在一起 避免继承爆炸
 */
public abstract class AbstractCar {

    private final AbstractTransmission transmission;

    public AbstractCar(AbstractTransmission transmission) {
        this.transmission = transmission;
    }

    public abstract void run();


    public static void main(String[] args) {
        AbstractCar car = new Toyota(new AtomaticTransmission());
        car.run();
    }
}
