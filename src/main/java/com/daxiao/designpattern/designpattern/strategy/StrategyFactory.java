package com.daxiao.designpattern.designpattern.strategy;

import java.io.Reader;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

/**
 * @ description:
 * @ author: daxiao
 * @ date: 2021/5/16
 * 策略的创建 用查表的方式 消除if-else逻辑判断
 */
public class StrategyFactory {

    private static Map<String, IStrategy> cachedStrategy = new HashMap<>();

    private static Map<String, Supplier<IStrategy>> strategies = new HashMap<>();

    static {
        // 当策略对象是无状态时（没有属性 或者是不可变对象），我们可以缓存在一个map中
        cachedStrategy.put("type1", new StrategyImpl1());
        cachedStrategy.put("type2", new StrategyImpl2());

        // 如果需要每次都创建新的对象 则value可以为一个对象创建的函数/行为
        strategies.put("type1", StrategyImpl1::new);
        strategies.put("type2", StrategyImpl2::new);
    }

    public static IStrategy getCachedStrategy(String type) {
        return cachedStrategy.get(type);
    }

    public static IStrategy getStrategy(String type) {
        return strategies.get(type).get();
    }

    public static void main(String[] args) {
        // 策略的使用 运行时动态确定使用的策略
        String dynamicType = "type1";
        StrategyFactory.getCachedStrategy(dynamicType).strategyMethod();
    }
}
