package com.sywf.factory_pattern.factory_method.exercise;

/**
 * Author: YiFan
 * Date: 2018/12/11 09:31
 * Description: 客户端
 */
public class Test {

    // 获取当前类所在的包名
    private static String packageName = Test.class.getPackage().getName();

    public static void main(String[] args) {
        ImgReader reader;
        ImgReaderFactory factory;

        // 强制转换，将Object对象转换成工厂对象
        factory = (ImgReaderFactory) XMLUtil.getBean("config.xml", packageName);
        reader = factory.createImgReader();
        reader.desc();
    }
}
