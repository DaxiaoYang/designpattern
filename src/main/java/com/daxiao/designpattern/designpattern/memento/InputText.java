package com.daxiao.designpattern.designpattern.memento;

/**
 * @ description:
 * @ author: daxiao
 * @ date: 2021/5/22
 */
public class InputText {

    private StringBuilder content = new StringBuilder();

    public void addContent(String input) {
        content.append(input);
    }

    public void backToVersion(Version version) {
        content.setLength(version.getContentLength());
    }

    public int getLength() {
        return content.length();
    }

    @Override
    public String toString() {
        return content.toString();
    }
}
