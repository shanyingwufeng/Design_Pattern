package com.sywf.factory_pattern.abstract_factory;

/**
 * Author: YiFan
 * Date: 2018/12/11 12:10
 * Description: 具体工厂类-创建多个产品
 */
public class MeizuFactory implements PhoneFactory {

    @Override
    public CPU createCPU() {
        return new MediaTekCPU();
    }

    @Override
    public Screen createScreen() {
        return new OLEDScreen();
    }
}
