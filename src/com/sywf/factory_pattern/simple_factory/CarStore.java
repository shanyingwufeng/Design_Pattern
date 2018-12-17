package com.sywf.factory_pattern.simple_factory;

/**
 * Author: YiFan
 * Date: 2018/12/7 14:39
 * Description:
 */
public class CarStore {

    public Car orderCar(String type) {
        Car car;
        car = SimpleCarFactory.createCar(type);
        return car;
    }

    public static void main(String[] args) {
        CarStore carStore = new CarStore();
        Car car = carStore.orderCar("AuDi");
        car.desc();
    }
}
