package com.sywf;

/**
 * Author: YiFan
 * Date: 2018/11/6 11:35
 * Description:
 */
public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("鸭子呱呱叫！");
    }
}
