package com.example.gupao.proxy.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * cglib动态代理
 *
 * @author liushiqiang
 * @date 2018/07/29 16:09
 */
public class ProxyCglib implements MethodInterceptor {

    public Object getInstance(Class clazz) throws Exception{
        Enhancer enhancer = new Enhancer();
        //告诉cglib需要继承的父类
        enhancer.setSuperclass(clazz);
        //设置回调
        enhancer.setCallback(this);
        //1.生成源代码
        //2.编译生成class文件
        //3.加载到jvm，并返回被代理对象

        return enhancer.create();
    }


    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib代理");
        //调用父类的方法，也就是被代理对象的方法
        methodProxy.invokeSuper(o,objects);
        return null;
    }
}
