package com.example.gupao.factory;

/**
 * 抽象工厂类
 *
 * @author liushiqiang
 * @date 2018/07/29 17:46
 */
public abstract class AbstractFactory {
    protected abstract Car getCar();

    public Car getCar(String name){
        if("audi".equalsIgnoreCase(name)){
            return new AudiFactory().getCar();
        }else{
            System.out.println("没有这个工厂");
            return null;
        }
    }
}
