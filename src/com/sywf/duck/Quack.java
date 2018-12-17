package com.sywf.duck;

/**
 * Author: YiFan
 * Date: 2018/11/6 13:03
 * Description:
 */
public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("会叫的鸭子");
    }
}
