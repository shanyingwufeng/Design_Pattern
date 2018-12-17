package com.sywf.factory_pattern.abstract_factory.exercise;

/**
 * Author: YiFan
 * Date: 2018/12/11 16:19
 * Description: 具体产品类
 */
public class SymbianOperationController implements OperationController {

    @Override
    public void operationController() {
        System.out.println("塞班系统操作控制");
    }
}
