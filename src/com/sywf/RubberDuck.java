package com.sywf;

/**
 * Author: YiFan
 * Date: 2018/11/6 11:02
 * Description: 橡胶鸭子
 */
public class RubberDuck extends Duck {

    public void quack() {
        System.out.println("吱吱叫！");
    }

    @Override
    public void display() {
        System.out.println("香蕉鸭子！");
    }
}
