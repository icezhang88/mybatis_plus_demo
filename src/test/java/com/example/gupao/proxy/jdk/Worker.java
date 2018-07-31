package com.example.gupao.proxy.jdk;

/**
 * 工人类
 *
 * @author liushiqiang
 * @date 2018/07/28 23:38
 */
public class Worker implements Person {

    private String name = "zhangsan";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void work() {
        System.out.println(this.name + "正在干活。。。");
    }
}
