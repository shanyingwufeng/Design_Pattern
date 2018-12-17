package com.sywf.factory_pattern.abstract_factory;

/**
 * Author: YiFan
 * Date: 2018/12/11 12:03
 * Description: 具体产品类
 */
public class QualcommCPU implements CPU {

    @Override
    public void cpuName() {
        System.out.println("高通CPU");
    }
}
