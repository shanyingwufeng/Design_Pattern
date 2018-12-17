package com.sywf.factory_pattern.abstract_factory;

/**
 * Author: YiFan
 * Date: 2018/12/11 12:05
 * Description: 具体产品类
 */
public class MediaTekCPU implements CPU {

    @Override
    public void cpuName() {
        System.out.println("联发科CPU");
    }
}
