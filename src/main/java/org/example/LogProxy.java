package org.example;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * jdk原生的动态代理
 */
public class LogProxy implements InvocationHandler {
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return null;
    }
}
