package com.example.gupao.delegate;

/**
 * 委派模式测试
 *
 * @author liushiqiang
 * @date 2018/07/29 19:38
 */
public class DelegateTest {
    public static void main(String[] args) {
        Dispatcher dispatcher = new Dispatcher(new ExecutorA());
        //看起来是调用dispatcher的doing方法，其实是在调用ExecutorA的方法
        dispatcher.doing();
    }
}
