package com.example.gupao.proxy.cglib;

/**
 * 工人类
 *
 * @author liushiqiang
 * @date 2018/07/28 23:38
 */
public class Worker{

    private String name = "zhangsan";

    public String getName() {
        return name;
    }

    public void work() {
        System.out.println(this.name + "正在干活。。。");
    }
}
