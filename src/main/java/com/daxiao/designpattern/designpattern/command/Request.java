package com.daxiao.designpattern.designpattern.command;

/**
 * @ description:
 * @ author: daxiao
 * @ date: 2021/5/22
 */
public class Request {

    private Class<? extends Command> commandType;

    public Request(Class<? extends Command> commandType) {
        this.commandType = commandType;
    }

    public Class<? extends Command> getCommandType() {
        return commandType;
    }
}
