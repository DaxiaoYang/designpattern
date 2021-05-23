package com.daxiao.designpattern.designpattern.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * @ description:
 * @ author: daxiao
 * @ date: 2021/5/21
 */
public class ArrayIterator<E> implements Iterator<E> {

    private int cursor;

    private ArrayList<E> elements;

    public ArrayIterator(ArrayList<E> elements) {
        this.elements = elements;
    }

    @Override
    public boolean hasNext() {
        return cursor != elements.size();
    }

    @Override
    public void next() {
        cursor++;
    }

    @Override
    public E currentItem() {
        if (cursor >= elements.size()) {
            throw new NoSuchElementException();
        }
        return elements.get(cursor);
    }

    public static void main(String[] args) {
//        ArrayList<String> strings = new ArrayList<>();
//        strings.add("a");
//        strings.add("b");
//        strings.add("c");
//        Iterator<String> iterator = new ArrayIterator<>(strings);
//        while (iterator.hasNext()) {
//            System.out.println(iterator.currentItem());
//            iterator.next();
//        }

        
    }
}
