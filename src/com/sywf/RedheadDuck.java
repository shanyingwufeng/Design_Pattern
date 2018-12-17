package com.sywf;

/**
 * Author: YiFan
 * Date: 2018/11/6 10:14
 * Description:
 */
public class RedheadDuck extends Duck {

    public RedheadDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("头的颜色为红色！");
    }
}
