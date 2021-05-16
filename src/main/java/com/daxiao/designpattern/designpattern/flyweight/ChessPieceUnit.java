package com.daxiao.designpattern.designpattern.flyweight;

/**
 * @ description:
 * @ author: daxiao
 * @ date: 2021/5/16
 * 被共享的字段组成的类
 */
public class ChessPieceUnit {

    private int id;

    private String text;

    private Color color;

    public ChessPieceUnit(int id, String text, Color color) {
        this.id = id;
        this.text = text;
        this.color = color;
    }

    public static enum Color {
        RED, BLACK
    }
}

