package com.sywf;

/**
 * Author: YiFan
 * Date: 2018/11/6 11:32
 * Description:
 */
public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("不会飞的鸭子！");
    }
}
