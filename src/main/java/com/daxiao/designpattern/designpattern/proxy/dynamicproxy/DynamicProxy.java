package com.daxiao.designpattern.designpattern.proxy.dynamicproxy;

import com.daxiao.designpattern.designpattern.proxy.staticproxy.IUser;
import com.daxiao.designpattern.designpattern.proxy.staticproxy.User;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ description:
 * @ author: daxiao
 * @ date: 2021/5/13
 * 动态代理：运行时动态创建被代理类对应的代理类 然后再系统中用代理类替换掉被代理类
 */
public class DynamicProxy {


    public static Object createProxy(Object proxiedObject) {
        Class<?>[] interfaces = proxiedObject.getClass().getInterfaces();
        DynamicProxyHandler dynamicProxyHandler = new DynamicProxyHandler(proxiedObject);
        return Proxy.newProxyInstance(proxiedObject.getClass().getClassLoader(), interfaces, dynamicProxyHandler);
    }

    private static class DynamicProxyHandler implements InvocationHandler {

        private final Object proxiedObject;

        public DynamicProxyHandler(Object proxiedObject) {
            this.proxiedObject = proxiedObject;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("before method");
            Object ret = method.invoke(proxiedObject, args);
            System.out.println("after method");
            return ret;
        }
    }

    public static void main(String[] args) {
        IUser proxy = (IUser) DynamicProxy.createProxy(new User());
        proxy.doSomething();
    }
}
