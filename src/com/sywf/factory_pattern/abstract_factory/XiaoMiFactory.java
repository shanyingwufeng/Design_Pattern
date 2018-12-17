package com.sywf.factory_pattern.abstract_factory;

/**
 * Author: YiFan
 * Date: 2018/12/11 12:08
 * Description: 具体工厂-创建一族产品（手机中的CPU和Screen）
 */
public class XiaoMiFactory implements PhoneFactory {

    @Override
    public CPU createCPU() {
        return new QualcommCPU();
    }

    @Override
    public Screen createScreen() {
        return new LCDScreen();
    }
}
