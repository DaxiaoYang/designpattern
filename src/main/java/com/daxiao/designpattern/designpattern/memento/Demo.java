package com.daxiao.designpattern.designpattern.memento;

import org.springframework.util.StringUtils;

import java.util.Scanner;

/**
 * @ description:
 * @ author: daxiao
 * @ date: 2021/5/22
 */
public class Demo {

    private static InputText inputText = new InputText();

    private static VersionHolder holder = new VersionHolder();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input;
        while (!StringUtils.isEmpty(input = in.next())) {
            if (":list".equals(input)) {
                System.out.println(inputText);
            } else if (":undo".equals(input)) {
                holder.popVersion();
                inputText.backToVersion(holder.currentVersion());
            } else {
                inputText.addContent(input);
                holder.pushVersion(new Version(inputText.getLength(), System.currentTimeMillis()));
            }
        }
    }
}
