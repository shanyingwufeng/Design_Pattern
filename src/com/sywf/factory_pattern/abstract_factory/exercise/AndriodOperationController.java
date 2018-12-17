package com.sywf.factory_pattern.abstract_factory.exercise;

/**
 * Author: YiFan
 * Date: 2018/12/11 16:20
 * Description: 具体产品类
 */
public class AndriodOperationController implements OperationController {

    @Override
    public void operationController() {
        System.out.println("安卓系统操作控制");
    }
}
