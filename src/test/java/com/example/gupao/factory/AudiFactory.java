package com.example.gupao.factory;

/**
 * 奥迪生产工厂
 *
 * @author liushiqiang
 * @date 2018/07/29 17:45
 */
public class AudiFactory extends AbstractFactory {
    @Override
    protected Car getCar() {
        return new AudiCar();
    }
}
