package com.sywf.factory_pattern.factory_method;

/**
 * Author: YiFan
 * Date: 2018/12/10 21:11
 * Description: 具体产品类
 */
public class AuDiCar extends Car {

    @Override
    public void desc() {
        System.out.println("奥迪汽车");
    }
}
