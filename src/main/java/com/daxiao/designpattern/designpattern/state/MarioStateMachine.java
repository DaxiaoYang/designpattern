package com.daxiao.designpattern.designpattern.state;

/**
 * @ description:
 * @ author: daxiao
 * @ date: 2021/5/18
 * 查表法实现状态机
 */
public class MarioStateMachine {

    private int score;

    private State currentState;

    private int[][] actionTable = new int[][]{
            {0,200,300,0},
            {0,200,300,-100},
            {0,0,0,-200},
            {0,0,0,-200}
    };

    private State[][] transitionTable = new State[][]{
            {State.SMALL, State.CAPE, State.FIRE, State.SMALL},
            {State.SUPER, State.CAPE, State.FIRE, State.SMALL},
            {State.FIRE, State.FIRE, State.FIRE, State.SMALL},
            {State.CAPE,State.CAPE,State.CAPE,State.SMALL}
    };

    public MarioStateMachine(int score) {
        this.score = score;
        currentState = State.SMALL;
    }

    public void obtainMushroom() {
        executeEvent(Event.GOT_MUSHROOM);
    }

    public void obtainCape() {
        executeEvent(Event.GOT_CAPE);
    }

    public void obtainFireFlower() {
        executeEvent(Event.GOT_FIRE);
    }

    public void meetMonster() {
        executeEvent(Event.MET_MONSTER);
    }

    private void executeEvent(Event event) {
        score += actionTable[currentState.getValue()][event.getValue()];
        currentState = transitionTable[currentState.getValue()][event.getValue()];
    }

    public int getScore() {
        return score;
    }

    public State getCurrentState() {
        return currentState;
    }
}
