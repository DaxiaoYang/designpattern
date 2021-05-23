package com.daxiao.designpattern.designpattern.command;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

/**
 * @ description:
 * @ author: daxiao
 * @ date: 2021/5/22
 */
public class CommandFactory {

    private static Map<Class, Supplier<Command>> map = new HashMap<>();

    static {
        // 现在构造函数中没有成员变量 所以用无参的构造函数
        map.put(UpgradeCommand.class, UpgradeCommand::new);
        map.put(GotMoneyCommand.class, GotMoneyCommand::new);
        map.put(EndCommand.class, EndCommand::new);
    }

    public static Command getCommand(Class commandType) {
        return map.get(commandType).get();
    }
}
