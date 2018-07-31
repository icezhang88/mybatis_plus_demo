package com.example.gupao.template;

/**
 * 教师职业
 *
 * @author liushiqiang
 * @date 2018/07/31 9:32
 */
public class Teacher extends Worker {
    @Override
    public void getUp() {
        System.out.println("8点钟起床");
    }

    @Override
    public void doWork() {
        System.out.println("教书");
    }
}
