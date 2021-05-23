package com.daxiao.designpattern.designpattern.state;

/**
 * @ description:
 * @ author: daxiao
 * @ date: 2021/5/19
 */
public class StateMachine {

    private int score;

    private IMario currentState;

    public StateMachine(int score) {
        this.score = score;
        currentState = new SmallMario(this);
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setCurrentState(IMario currentState) {
        this.currentState = currentState;
    }

    public int getScore() {
        return score;
    }

    public IMario getCurrentState() {
        return currentState;
    }

    public void obtainMushroom() {
        currentState.obtainMushroom();
    }

    public void obtainCape() {
        currentState.obtainCape();
    }

    public void obtainFireFlower() {
        currentState.obtainFireFlower();
    }

    public void meetMonster() {
        currentState.meetMonster();
    }
}
