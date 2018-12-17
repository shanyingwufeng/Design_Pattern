package com.sywf.factory_pattern.simple_factory;

/**
 * Author: YiFan
 * Date: 2018/12/7 12:40
 * Description:
 */
public class SimpleCarFactory {

    public static Car createCar(String type) {
        if ("BMW".equals(type)) {
            return new BMWCar();
        } else if ("AuDi".equals(type)) {
            return new AuDiCar();
        } else {
            System.out.println("无法识别的类型");
            return null;
        }
    }
}
