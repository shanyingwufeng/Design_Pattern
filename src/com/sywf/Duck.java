package com.sywf;

/**
 * Author: YiFan
 * Date: 2018/11/6 10:13
 * Description:
 */
public abstract class Duck {

    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;

    void swim() {
        System.out.println("游泳！");
    }

    // 鸭子的外观
    public abstract void display();

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }
}
