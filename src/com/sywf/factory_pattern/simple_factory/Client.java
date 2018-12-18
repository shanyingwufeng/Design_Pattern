package com.sywf.factory_pattern.simple_factory;

/**
 * Author: YiFan
 * Date: 2018/12/18 15:00
 * Description: 客户端测试类
 */
public class Client {

    public static void main(String[] args) {
        Car car;
        car = SimpleCarFactory.createCar("BMW");
        car.desc();
    }
}
