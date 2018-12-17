package com.sywf.factory_pattern.simple_factory.exercise;

/**
 * Author: YiFan
 * Date: 2018/12/10 19:23
 * Description: 简单工厂模式-产品角色
 */
public class Round extends Shape {

    @Override
    public void draw() {
        System.out.println("绘制圆形");
    }

    @Override
    public void erase() {
        System.out.println("擦除圆形");
    }
}
