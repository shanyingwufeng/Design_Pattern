package com.sywf.build_pattern;

/**
 * Author: YiFan
 * Date: 2018/12/13 11:30
 * Description: 宝马320汽车生产车间
 */
public class BMW320CarBuilder implements IBuildBMWCar {

    private BMWCar bmwCar;

    public BMW320CarBuilder() {
        bmwCar = new BMWCar();
    }

    @Override
    public void buildAppearance() {
        bmwCar.setAppearance("宝马320外型");
    }

    @Override
    public void buildTire() {
        bmwCar.setTire("宝马320轮胎");
    }

    @Override
    public void buildNavigator() {
        bmwCar.setNavigator("宝马320导航仪");
    }

    @Override
    public BMWCar produceBMWCar() {
        return bmwCar;
    }
}
