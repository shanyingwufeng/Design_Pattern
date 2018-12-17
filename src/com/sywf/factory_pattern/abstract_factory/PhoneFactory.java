package com.sywf.factory_pattern.abstract_factory;

/**
 * Author: YiFan
 * Date: 2018/12/11 12:07
 * Description: 抽象工厂类-定义多个产品创建方法
 */
public interface PhoneFactory {

    CPU createCPU();

    Screen createScreen();
}
