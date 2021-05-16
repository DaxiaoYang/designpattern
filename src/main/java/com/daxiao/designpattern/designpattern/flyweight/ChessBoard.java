package com.daxiao.designpattern.designpattern.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @ description:
 * @ author: daxiao
 * @ date: 2021/5/16
 */
public class ChessBoard {

    private Map<Integer, ChessPiece> map = new HashMap<>();

    public ChessBoard() {
        init();
    }

    private void init() {
        map.put(1, new ChessPiece(ChessPieceUnitFactory.getPieceUnit(1), 1, 0));
        map.put(2, new ChessPiece(ChessPieceUnitFactory.getPieceUnit(2), 0, 1));
    }

    public void move(int chessPieceId, int toPositionX, int toPositionY) {
        // move piece
    }
}
