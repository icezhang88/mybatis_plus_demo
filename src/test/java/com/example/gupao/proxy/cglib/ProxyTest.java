package com.example.gupao.proxy.cglib;

/**
 * cglib代理测试
 *
 * @author liushiqiang
 * @date 2018/07/29 16:19
 */
public class ProxyTest {
    public static void main(String[] args) {
        try {
            Worker worker = (Worker) new ProxyCglib().getInstance(Worker.class);
            worker.work();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
