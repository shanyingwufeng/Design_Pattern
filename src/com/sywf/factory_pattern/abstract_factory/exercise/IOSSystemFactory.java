package com.sywf.factory_pattern.abstract_factory.exercise;

/**
 * Author: YiFan
 * Date: 2018/12/11 16:29
 * Description: 具体工厂类
 */
public class IOSSystemFactory implements SystemFactory {

    @Override
    public OperationController createOperationController() {
        return new IOSOperationController();
    }

    @Override
    public InterfaceController createInterfaceController() {
        return new IOSInterfaceController();
    }
}
