package com.sywf.build_pattern;

/**
 * Author: YiFan
 * Date: 2018/12/13 11:35
 * Description: 指挥者
 */
public class Director {

    public BMWCar produceBMWCarByDirector(IBuildBMWCar buildBMWCar) {
        buildBMWCar.buildAppearance();
        buildBMWCar.buildTire();
        buildBMWCar.buildNavigator();
        return buildBMWCar.produceBMWCar();
    }
}
