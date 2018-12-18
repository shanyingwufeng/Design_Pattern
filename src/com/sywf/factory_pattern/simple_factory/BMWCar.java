package com.sywf.factory_pattern.simple_factory;

/**
 * Author: YiFan
 * Date: 2018/12/7 12:38
 * Description: 具体产品角色-宝马汽车类
 */
public class BMWCar extends Car {

    @Override
    public void desc() {
        System.out.println("宝马汽车");
    }
}
