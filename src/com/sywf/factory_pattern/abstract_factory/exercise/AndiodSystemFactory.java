package com.sywf.factory_pattern.abstract_factory.exercise;

/**
 * Author: YiFan
 * Date: 2018/12/11 16:29
 * Description: 具体工厂类
 */
public class AndiodSystemFactory implements SystemFactory {

    @Override
    public OperationController createOperationController() {
        return new AndriodOperationController();
    }

    @Override
    public InterfaceController createInterfaceController() {
        return new AndriodInterfaceController();
    }
}
