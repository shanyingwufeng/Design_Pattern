package com.sywf.factory_pattern.factory_method;

/**
 * Author: YiFan
 * Date: 2018/12/10 21:18
 * Description: 客户端代码-测试类
 */
public class CarTest {

    public static void main(String[] args) {
        // 创建一个具体工厂实例
        CarFactory bmwCarFactory = new BMWCarFactory();
        // 调用具体工厂的produceCar()方法创建具体产品
        Car car = bmwCarFactory.produceCar();
        car.desc();
		
        CarFactory auDiCarFactory = new AuDiCarFactory();
        Car car1 = auDiCarFactory.produceCar();
        car1.desc();
    }
}
