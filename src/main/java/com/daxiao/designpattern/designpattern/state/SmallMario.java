package com.daxiao.designpattern.designpattern.state;

/**
 * @ description:
 * @ author: daxiao
 * @ date: 2021/5/19
 */
public class SmallMario implements IMario {

    private StateMachine stateMachine;

    public SmallMario(StateMachine stateMachine) {
        this.stateMachine = stateMachine;
    }

    @Override
    public void obtainMushroom() {
        stateMachine.setScore(stateMachine.getScore() + 100);
        stateMachine.setCurrentState(new SuperMario(stateMachine));
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
