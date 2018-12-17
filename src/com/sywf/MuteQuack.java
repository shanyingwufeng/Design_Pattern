package com.sywf;

/**
 * Author: YiFan
 * Date: 2018/11/6 11:36
 * Description:
 */
public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("不会叫的鸭子！");
    }
}
