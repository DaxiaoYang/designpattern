package com.daxiao.designpattern.designpattern.flyweight;

/**
 * @ description:
 * @ author: daxiao
 * @ date: 2021/5/16
 */
public class ChessPiece {

    private ChessPieceUnit chessPieceUnit;

    private int positionX;

    private int positionY;

    public ChessPiece(ChessPieceUnit chessPieceUnit, int positionX, int positionY) {
        this.chessPieceUnit = chessPieceUnit;
        this.positionX = positionX;
        this.positionY = positionY;
    }
}
