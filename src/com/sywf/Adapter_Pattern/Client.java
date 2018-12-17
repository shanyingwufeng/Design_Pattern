package com.sywf.adapter_pattern;

/**
 * Author: YiFan
 * Date: 2018/12/17 12:34
 * Description: 客户端测试类
 */
public class Client {

    public static void main(String[] args) {

        IDataBaseOperation dataBaseOperation;

        dataBaseOperation = new Adapter();

        dataBaseOperation.informationEncryption();
    }
}
