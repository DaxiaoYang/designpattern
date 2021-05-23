package com.daxiao.designpattern.designpattern.state;

/**
 * @ description:
 * @ author: daxiao
 * @ date: 2021/5/19
 */
public class SuperMario implements IMario{

    private StateMachine stateMachine;

    public SuperMario(StateMachine stateMachine) {
        this.stateMachine = stateMachine;
    }

    @Override
    public void obtainMushroom() {

    }

    @Override
    public void obtainCape() {

    }

    @Override
    public void obtainFireFlower() {

    }

    @Override
    public void meetMonster() {

    }
}
