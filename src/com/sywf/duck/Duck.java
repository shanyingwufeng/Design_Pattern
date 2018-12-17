package com.sywf.duck;

/**
 * Author: YiFan
 * Date: 2018/11/6 13:00
 * Description:
 */
public abstract class Duck {

    QuackBehavior quackBehavior;

    public void performQuack() {
        quackBehavior.quack();
    }

    // 鸭子都可以游泳，活的死的都可以
    void swim() {
        System.out.println("游泳");
    }

    // 鸭子的外观，抽象方法，每个鸭子都不同
    public abstract void display();
}
