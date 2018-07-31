package com.example.gupao.factory;

/**
 * 默认工厂
 *
 * @author liushiqiang
 * @date 2018/07/29 17:50
 */
public class DefaultFactory extends AbstractFactory {

    private AudiFactory defaultFactory = new AudiFactory();

    @Override
    protected Car getCar() {
        return defaultFactory.getCar();
    }
}
