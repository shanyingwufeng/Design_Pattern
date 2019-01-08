package com.sywf.adapter_pattern;

/**
 * Author: YiFan
 * Date: 2018/12/17 12:30
 * Description: 适配器类
 */
public class EncryptionAdapter implements IDataBaseOperation {

    private Adaptee adaptee;

    public EncryptionAdapter() {
        adaptee = new Adaptee();
    }

    @Override
    public String informationEncryption(String info) {
        return adaptee.informationEncryptionByMD5(info);
    }
}
