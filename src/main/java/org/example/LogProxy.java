package org.example;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * jdk原生的动态代理
 */
public class LogProxy implements InvocationHandler {
    DataService delegate;
    public LogProxy(DataService delegate){
        this.delegate = delegate;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(method.getName()+"被调用："+ Arrays.toString(args));
        Object resultValue = method.invoke(delegate,args);
        System.out.println(method.getName()+"调用完成"+resultValue);
        return resultValue;
    }
}
