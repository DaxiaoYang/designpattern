package com.daxiao.designpattern.opensource;

import java.util.*;

/**
 * @ description:
 * @ author: daxiao
 * @ date: 2021/5/23
 */
public class Adapter {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("1", "2", "3");
        Collection<String> strings1 = Collections.unmodifiableCollection(Collections.synchronizedCollection(strings));


        Calendar instance = Calendar.getInstance(TimeZone.getDefault(), Locale.CHINA);
        System.out.println(instance.toInstant());

        Calendar build = new Calendar.Builder().setDate(2021, 5, 23).build();
        System.out.println(build.toInstant());

        Runnable runnable = new Runnable() {
            // 定义匿名内部类的时候 可以直接定义成员变量
            private int sum = 0;

            @Override
            public void run() {
                while (sum < 100) {
                    System.out.println(sum++);
                }
            }
        };
//        new Thread(runnable).start();
    }
}
