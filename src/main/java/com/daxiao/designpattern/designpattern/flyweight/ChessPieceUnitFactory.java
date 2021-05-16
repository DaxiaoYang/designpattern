package com.daxiao.designpattern.designpattern.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @ description:
 * @ author: daxiao
 * @ date: 2021/5/16
 */
public class ChessPieceUnitFactory {

    private static Map<Integer, ChessPieceUnit> map = new HashMap<>();

    static {
        map.put(1, new ChessPieceUnit(1, "车", ChessPieceUnit.Color.RED));
        map.put(1, new ChessPieceUnit(2, "马", ChessPieceUnit.Color.RED));
    }

    public static ChessPieceUnit getPieceUnit(int id) {
        return map.get(id);
    }
}
