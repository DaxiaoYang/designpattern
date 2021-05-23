package com.daxiao.designpattern.designpattern.command;

/**
 * @ description:
 * @ author: daxiao
 * @ date: 2021/5/22
 */
public class GotMoneyCommand implements Command {

    @Override
    public void execute() {
        System.out.println("got money");
    }
}
