package com.example.gupao.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * person代理类
 *
 * @author liushiqiang
 * @date 2018/07/28 23:42
 */
public class PersonProxy implements InvocationHandler {

    private Person target;

    //获取被代理对象的资料
    public Object getInstant(Person target) throws Exception{
        this.target = target;
        Class<? extends Person> targetClass = target.getClass();
        return Proxy.newProxyInstance(targetClass.getClassLoader(), targetClass.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(this.target.getName() + "这个是代理对象");
        this.target.work();

        return null;
    }
}
