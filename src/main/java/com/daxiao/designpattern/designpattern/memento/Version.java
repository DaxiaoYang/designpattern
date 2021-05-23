package com.daxiao.designpattern.designpattern.memento;

/**
 * @ description:
 * @ author: daxiao
 * @ date: 2021/5/22
 */
public class Version {

    private int contentLength;

    private long timeStamp;

    public Version(int contentLength, long timeStamp) {
        this.contentLength = contentLength;
        this.timeStamp = timeStamp;
    }

    public int getContentLength() {
        return contentLength;
    }

    public long getTimeStamp() {
        return timeStamp;
    }
}
