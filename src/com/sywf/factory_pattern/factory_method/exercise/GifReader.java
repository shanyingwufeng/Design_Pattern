package com.sywf.factory_pattern.factory_method.exercise;

/**
 * Author: YiFan
 * Date: 2018/12/11 09:15
 * Description: 具体产品类-Gif阅读器
 */
public class GifReader implements ImgReader {

    @Override
    public void desc() {
        System.out.println("读取GIF格式图片");
    }
}
