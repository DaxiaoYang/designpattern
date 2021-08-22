package com.daxiao.designpattern.opensource.guava;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.collect.ImmutableList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @ description:
 * @ author: daxiao
 * @ date: 2021/5/24
 */
public class Guava {

    public static void main(String[] args) {
        immuatable();
    }

    public static void cache() {
        Cache<String, Object> cache = CacheBuilder.newBuilder().initialCapacity(20)
                .maximumSize(100)
                .expireAfterWrite(10, TimeUnit.MINUTES)
                .build();

    }

    public static void immuatable() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        List<String> unmodifiableList = Collections.unmodifiableList(list);
        ImmutableList<String> immutableList = ImmutableList.copyOf(list);
        list.add("d");
        System.out.println(unmodifiableList);
        System.out.println(immutableList);
    }
}
