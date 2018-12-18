package com.sywf.factory_pattern.simple_factory;

/**
 * Author: YiFan
 * Date: 2018/12/7 12:40
 * Description: 工厂类
 */
public class SimpleCarFactory {

    /**
     * 静态方法-根据传入的参数返回不同类实例
     * @param type 传入的汽车品牌
     * @return Car对象实例
     */
    public static Car createCar(String type) {
        if ("BMW".equals(type)) { // 如果传入的是"BMW"，则返回BMWCar类实例
            return new BMWCar();
        } else if ("AuDi".equals(type)) { // 如果传入的是"AuDi"，则返回AuDiCar类实例
            return new AuDiCar();
        } else {
            System.out.println("无法识别的类型");
            return null;
        }
    }
}
