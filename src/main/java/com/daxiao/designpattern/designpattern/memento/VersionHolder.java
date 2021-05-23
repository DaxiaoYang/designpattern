package com.daxiao.designpattern.designpattern.memento;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @ description:
 * @ author: daxiao
 * @ date: 2021/5/22
 */
public class VersionHolder {

    private Deque<Version> stack = new LinkedList<>();

    public VersionHolder() {
        stack.push(new Version(0, System.currentTimeMillis()));
    }

    public void pushVersion(Version version) {
        stack.push(version);
    }

    public Version popVersion() {
        return stack.pop();
    }

    public Version currentVersion() {
        return stack.peek();
    }
}
