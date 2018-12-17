package com.sywf.factory_pattern.abstract_factory;

/**
 * Author: YiFan
 * Date: 2018/12/11 12:06
 * Description: 具体产品类
 */
public class OLEDScreen implements Screen {

    @Override
    public void screenName() {
        System.out.println("OLED屏幕");
    }
}
