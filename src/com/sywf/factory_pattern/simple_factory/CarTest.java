package com.sywf.factory_pattern.simple_factory;

/**
 * Author: YiFan
 * Date: 2018/12/7 12:41
 * Description: 客户端-测试
 */
public class CarTest {

    public static void main(String[] args) {
        CarStore carStore = new CarStore();
        Car car = carStore.orderCar("BMW");
        car.desc();
    }
}
