package com.example.gupao.proxy.jdk;

/**
 * JDK代理测试类
 *
 * @author liushiqiang
 * @date 2018/07/28 23:41
 */
public class ProxyTest {
    public static void main(String[] args) {
        try {
            Person person = (Person) new PersonProxy().getInstant(new Worker());
            person.work();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
