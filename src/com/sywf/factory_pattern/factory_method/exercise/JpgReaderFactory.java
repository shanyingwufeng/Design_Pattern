package com.sywf.factory_pattern.factory_method.exercise;

/**
 * Author: YiFan
 * Date: 2018/12/11 09:20
 * Description: 具体工厂类-Jpg阅读器工厂
 */
public class JpgReaderFactory implements ImgReaderFactory {

    @Override
    public ImgReader createImgReader() {
        return new JpgReader();
    }
}
