package com.example.gupao.factory;

/**
 * 工厂测试
 *
 * @author liushiqiang
 * @date 2018/07/29 17:58
 */
public class FactoryTest {
    public static void main(String[] args) {
        DefaultFactory factory = new DefaultFactory();
        Car car = factory.getCar("audi1");
        Car car2 = factory.getCar();
        System.out.println(car.getName());
    }
}
