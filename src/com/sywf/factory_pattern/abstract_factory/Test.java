package com.sywf.factory_pattern.abstract_factory;

/**
 * Author: YiFan
 * Date: 2018/12/11 12:11
 * Description: 客户端
 */
public class Test {

    public static void main(String[] args) {
        PhoneFactory factory;
        CPU cpu;
        Screen screen;

        factory = new XiaoMiFactory();
        cpu = factory.createCPU();
        screen = factory.createScreen();
        cpu.cpuName();
        screen.screenName();
    }
}
