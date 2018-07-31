package com.example.gupao.singleton;

/**
 * 单例模式手写demo
 *
 * @author liushiqiang
 * @date 2018/07/29 18:43
 */
public class SingletonDemo {
    private SingletonDemo(){}
    private static class LazyHolder{
        private static final SingletonDemo instance = new SingletonDemo();
    }
    public static final SingletonDemo getInstance(){
        return LazyHolder.instance;
    }
}
