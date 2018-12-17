package com.sywf;

/**
 * Author: YiFan
 * Date: 2018/11/6 11:36
 * Description:
 */
public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("鸭子吱吱叫！");
    }
}
