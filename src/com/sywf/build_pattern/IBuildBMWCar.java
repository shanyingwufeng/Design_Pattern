package com.sywf.build_pattern;

/**
 * Author: YiFan
 * Date: 2018/12/13 11:27
 * Description: 造宝马车接口
 */
public interface IBuildBMWCar {

    void buildAppearance();

    void buildTire();

    void buildNavigator();

    BMWCar produceBMWCar();
}