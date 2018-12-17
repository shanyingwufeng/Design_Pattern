package com.sywf.factory_pattern.factory_method.exercise;

/**
 * Author: YiFan
 * Date: 2018/12/11 09:16
 * Description: 具体产品类-Jpg阅读器
 */
public class JpgReader implements ImgReader {

    @Override
    public void desc() {
        System.out.println("读取JPG格式图片");
    }
}
