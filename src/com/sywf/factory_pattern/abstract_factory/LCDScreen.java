package com.sywf.factory_pattern.abstract_factory;

/**
 * Author: YiFan
 * Date: 2018/12/11 12:06
 * Description: 具体产品类
 */
public class LCDScreen implements Screen {

    @Override
    public void screenName() {
        System.out.println("LCD屏幕");
    }
}
