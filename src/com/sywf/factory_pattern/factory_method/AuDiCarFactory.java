package com.sywf.factory_pattern.factory_method;

/**
 * Author: YiFan
 * Date: 2018/12/10 21:17
 * Description: 具体工厂类
 */
public class AuDiCarFactory extends CarFactory {

    @Override
    public Car produceCar() {
        return new AuDiCar();
    }
}
