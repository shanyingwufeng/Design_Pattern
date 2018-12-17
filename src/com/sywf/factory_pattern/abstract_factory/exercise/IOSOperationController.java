package com.sywf.factory_pattern.abstract_factory.exercise;

/**
 * Author: YiFan
 * Date: 2018/12/11 16:21
 * Description: 具体产品类
 */
public class IOSOperationController implements OperationController {

    @Override
    public void operationController() {
        System.out.println("苹果系统操作控制");
    }
}
