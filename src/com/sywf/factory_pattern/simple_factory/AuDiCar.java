package com.sywf.factory_pattern.simple_factory;

/**
 * Author: YiFan
 * Date: 2018/12/7 12:39
 * Description: 具体产品角色-奥迪汽车类
 */
public class AuDiCar extends Car {

    @Override
    public void desc() {
        System.out.println("奥迪汽车");
    }
}
