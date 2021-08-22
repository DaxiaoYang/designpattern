package com.daxiao.designpattern.opensource.guava;

import com.google.common.collect.ForwardingCollection;
import lombok.extern.slf4j.Slf4j;

import java.util.Collection;

/**
 * @ description:
 * @ author: daxiao
 * @ date: 2021/5/24
 */
@Slf4j
public class AddLogCollection<E> extends ForwardingCollection<E> {

    private Collection<E> originalCollection;

    public AddLogCollection(Collection<E> collection) {
        originalCollection = collection;
    }

    @Override
    protected Collection delegate() {
        return originalCollection;
    }

    @Override
    public boolean add(E element) {
        log.info("add element:{}", element);
        return super.add(element);
    }

    @Override
    public boolean addAll(Collection<? extends E> collection) {
        log.info("add elemnts:{}", collection);
        return super.addAll(collection);
    }
}
