package com.sywf.build_pattern;

/**
 * Author: YiFan
 * Date: 2018/12/13 11:39
 * Description: 客户端
 */
public class Client {

    public static void main(String[] args) {

        Director director = new Director();

        BMWCar bmwCar = director.produceBMWCarByDirector(new BMW320CarBuilder());
        BMWCar bmwCar1 = director.produceBMWCarByDirector(new BMW535CarBuilder());

        System.out.println(bmwCar.getAppearance());
        System.out.println(bmwCar.getTire());
        System.out.println(bmwCar.getNavigator());

        System.out.println("------------------");

        System.out.println(bmwCar1.getAppearance());
        System.out.println(bmwCar1.getTire());
        System.out.println(bmwCar1.getNavigator());
    }
}
