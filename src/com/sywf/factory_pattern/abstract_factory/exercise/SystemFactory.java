package com.sywf.factory_pattern.abstract_factory.exercise;

/**
 * Author: YiFan
 * Date: 2018/12/11 16:26
 * Description: 抽象工厂
 */
public interface SystemFactory {

    // 返回具体的操作控制对象
    OperationController createOperationController();

    // 返回具体的界面控制对象
    InterfaceController createInterfaceController();
}
