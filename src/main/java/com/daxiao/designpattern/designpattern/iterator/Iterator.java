package com.daxiao.designpattern.designpattern.iterator;

/**
 * @ description:
 * @ author: daxiao
 * @ date: 2021/5/21
 */
public interface Iterator<E> {

    boolean hasNext();

    void next();

    E currentItem();
}
