package com.sywf.factory_pattern.abstract_factory.exercise;

/**
 * Author: YiFan
 * Date: 2018/12/11 16:30
 * Description: 客户端
 */
public class Test {

    public static void main(String[] args) {
        SystemFactory systemFactory;
        OperationController operationController;
        InterfaceController interfaceController;
//        systemFactory = new AndiodSystemFactory();
        systemFactory = new IOSSystemFactory();
        operationController = systemFactory.createOperationController();
        interfaceController = systemFactory.createInterfaceController();
        operationController.operationController();
        interfaceController.interfaceController();
    }
}
