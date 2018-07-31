package com.example.gupao.delegate;

/**
 * 委派者
 *
 * @author liushiqiang
 * @date 2018/07/29 19:36
 */
public class Dispatcher implements IExecutor {
    private IExecutor executor;
    Dispatcher(IExecutor executor){
        this.executor = executor;
    }
    @Override
    public void doing() {
        this.executor.doing();
    }
}
