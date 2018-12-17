package com.sywf.duck;

/**
 * Author: YiFan
 * Date: 2018/11/6 13:06
 * Description:
 */
public class RedheadDuck extends Duck {

    public RedheadDuck() {
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("头的颜色为红色");
    }
}
