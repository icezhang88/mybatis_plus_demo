package com.example.gupao.singleton;

/**
 * 单例模式示例
 * 懒汉式（内部静态类） 反射也无法破坏
 * 在创建类的时候静态内部类已经创建了
 * 静态内部类只创建一份，不存在线程安全问题
 * 当调用getInstance()方法时才执行new的操作，解决性能问题
 * 解决安全问题也解决性能问题
 *
 * @author liushiqiang
 * @date 2018/07/29 18:33
 */
public class Singleton {
    //1.先生成一个内部静态类
    //私有的保证别人不能修改
    //static保证全局唯一
    private static class LazyHolder{
        //final 防止内部误操作
        private static final Singleton INSTANCE = new Singleton();
    }
    //2.将默认构造方法私有化，防止通过new创建对象
    private Singleton(){}
    //3.通过static方法获取对象
    //final确保别人不能覆盖
    public static final Singleton getInstance(){
        return LazyHolder.INSTANCE;
    }
}
