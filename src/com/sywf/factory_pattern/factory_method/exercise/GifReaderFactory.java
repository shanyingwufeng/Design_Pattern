package com.sywf.factory_pattern.factory_method.exercise;

/**
 * Author: YiFan
 * Date: 2018/12/11 09:18
 * Description: 具体工厂类-Gif阅读器工厂
 */
public class GifReaderFactory implements ImgReaderFactory {

    @Override
    public ImgReader createImgReader() {
        return new GifReader();
    }
}
