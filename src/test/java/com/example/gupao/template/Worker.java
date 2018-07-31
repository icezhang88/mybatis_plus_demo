package com.example.gupao.template;

/**
 * 工作者模板抽象类
 *
 * @author liushiqiang
 * @date 2018/07/31 9:28
 */
public abstract class Worker {
    public final void work(){
        getUp();
        gotoOffice();
        doWork();
        goHome();
    }
    public abstract void getUp();
    public final void gotoOffice(){
        System.out.println("去办公室");
    }
    public abstract void doWork();
    public final void goHome(){
        System.out.println("下班回家");
    }
}
