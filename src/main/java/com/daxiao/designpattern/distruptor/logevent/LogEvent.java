package com.daxiao.designpattern.distruptor.logevent;

import java.util.List;

/**
 * @ description:
 * @ author: daxiao
 * @ date: 2021/8/7
 */
public class LogEvent {

    private List<LogInfo> list;

    public void setList(List<LogInfo> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "LogEvent{" +
                "list=" + list +
                '}';
    }
}
