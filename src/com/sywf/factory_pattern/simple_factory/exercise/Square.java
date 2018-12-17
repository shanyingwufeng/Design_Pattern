package com.sywf.factory_pattern.simple_factory.exercise;

/**
 * Author: YiFan
 * Date: 2018/12/10 19:25
 * Description: 简单工厂模式-产品角色
 */
public class Square extends Shape {

    @Override
    public void draw() {
        System.out.println("绘制方形");
    }

    @Override
    public void erase() {
        System.out.println("擦除方形");
    }
}
