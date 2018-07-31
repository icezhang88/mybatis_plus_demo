package com.example.gupao.delegate;

/**
 * 执行者A
 *
 * @author liushiqiang
 * @date 2018/07/29 19:35
 */
public class ExecutorA implements IExecutor {
    @Override
    public void doing() {
        System.out.println(this.getClass().getName() + "正在干活");
    }
}
