package com.sywf.Adapter_Pattern;

/**
 * Author: YiFan
 * Date: 2018/12/17 12:30
 * Description:
 */
public class Adapter implements IDataBaseOperation {

    private Adaptee adaptee;

    public Adapter() {
        adaptee = new Adaptee();
    }

    @Override
    public void informationEncryption() {
        adaptee.specificInformationEncryption();
    }
}
