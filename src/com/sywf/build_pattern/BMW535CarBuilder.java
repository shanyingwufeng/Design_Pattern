package com.sywf.build_pattern;

/**
 * Author: YiFan
 * Date: 2018/12/13 11:51
 * Description:
 */
public class BMW535CarBuilder implements IBuildBMWCar {

    private BMWCar bmwCar;

    public BMW535CarBuilder() {
        bmwCar = new BMWCar();
    }

    @Override
    public void buildAppearance() {
        bmwCar.setAppearance("宝马535外型");
    }

    @Override
    public void buildTire() {
        bmwCar.setTire("宝马535轮胎");
    }

    @Override
    public void buildNavigator() {
        bmwCar.setNavigator("宝马535导航仪");
    }

    @Override
    public BMWCar produceBMWCar() {
        return bmwCar;
    }
}
