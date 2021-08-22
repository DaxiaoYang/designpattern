package com.daxiao.designpattern;

import org.apache.catalina.Valve;
import org.apache.catalina.connector.Request;
import org.apache.catalina.connector.Response;
import org.apache.catalina.valves.ValveBase;

import javax.servlet.ServletException;
import java.io.IOException;

/**
 * @ description:
 * @ author: daxiao
 * @ date: 2021/6/29
 * 向请求头中添加traceId
 */
public class TraceValve extends ValveBase {
    @Override
    public void invoke(Request request, Response response) throws IOException, ServletException {
        request.getCoyoteRequest().getMimeHeaders().addValue("traceId").setString("123");
        Valve next = getNext();
        if (next == null) {
            return;
        }
        next.invoke(request, response);
    }
}
