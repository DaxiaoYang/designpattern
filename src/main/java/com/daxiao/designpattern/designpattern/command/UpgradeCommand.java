package com.daxiao.designpattern.designpattern.command;

/**
 * @ description:
 * @ author: daxiao
 * @ date: 2021/5/22
 */
public class UpgradeCommand implements Command{

    // other members

    @Override
    public void execute() {
        System.out.println("execute upgrade");
    }
}
