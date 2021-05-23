package com.daxiao.designpattern.designpattern.command;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @ description:
 * @ author: daxiao
 * @ date: 2021/5/22
 */
public class GameApplication {


    private static Queue<Command> queue = new LinkedList<>();

    private static final int MAX_PROCESS_SIZE_PER_LOOP = 100;

    public static void main(String[] args) {
        // 同步处理 每次只处理一部分内容
        while (true) {
            // 等待请求 并且设置一个超时时间 将请求封装为request对象
            List<Request> requests = Arrays.asList(new Request(EndCommand.class), new Request(GotMoneyCommand.class), new Request(UpgradeCommand.class));
            for (Request request : requests) {
                queue.add(CommandFactory.getCommand(request.getCommandType()));
            }
            int handledCount = 0;
            while (handledCount < MAX_PROCESS_SIZE_PER_LOOP) {
                if (queue.isEmpty()) {
                    break;
                }
                queue.poll().execute();
            }
        }
    }
}
