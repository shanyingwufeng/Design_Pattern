package com.sywf.factory_pattern.abstract_factory.exercise;

/**
 * Author: YiFan
 * Date: 2018/12/11 16:28
 * Description: 具体工厂
 */
public class SybianSystemFactory implements SystemFactory {

    @Override
    public OperationController createOperationController() {
        return new SymbianOperationController();
    }

    @Override
    public InterfaceController createInterfaceController() {
        return new SymbianInterfaceController();
    }
}
