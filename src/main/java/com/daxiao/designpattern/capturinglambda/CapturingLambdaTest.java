package com.daxiao.designpattern.capturinglambda;

import java.math.BigDecimal;
import java.util.function.Function;

/**
 * @ description:
 * @ author: daxiao
 * @ date: 2021/8/7
 */
public class CapturingLambdaTest {

    private static BigDecimal instanceVariable = new BigDecimal(1);

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        test3();
        long end = System.currentTimeMillis();
        System.out.println("time:" + (end - start) + "ms");
    }

    public static void test1() {
        // time:1502ms
        final BigDecimal localVariable = new BigDecimal(1);
        Function<BigDecimal, BigDecimal> function = num -> localVariable.multiply(num);
        for (int i = 0; i < 999999999; i++) {
            function.apply(new BigDecimal(i));
        }        
    }

    public static void test2() {
        // time:1492ms
        Function<BigDecimal, BigDecimal> function = num -> instanceVariable.multiply(num);
        for (int i = 0; i < 999999999; i++) {
            function.apply(new BigDecimal(i));
        }
    }

    public static void test3() {
        // time:1502ms
        Function<BigDecimal, BigDecimal> function = num -> num.multiply(BigDecimal.ONE);
        for (int i = 0; i < 999999999; i++) {
            function.apply(new BigDecimal(i));
        }
    }
}
