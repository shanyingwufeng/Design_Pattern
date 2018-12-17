package com.sywf.factory_pattern.abstract_factory.exercise;

/**
 * Author: YiFan
 * Date: 2018/12/11 16:24
 * Description: 具体产品类
 */
public class IOSInterfaceController implements InterfaceController {

    @Override
    public void interfaceController() {
        System.out.println("苹果系统界面控制");
    }
}
