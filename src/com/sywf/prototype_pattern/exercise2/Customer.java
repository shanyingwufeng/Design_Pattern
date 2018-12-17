package com.sywf.prototype_pattern.exercise2;

import java.io.*;

/**
 * Author: YiFan
 * Date: 2018/12/12 21:26
 * Description: 具体原型类
 */
public class Customer implements Cloneable, Serializable {

    private String name;

    private int age;

    private Address address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    /**
     * 浅克隆
     * @return Customer
     * @throws CloneNotSupportedException
     */
    @Override
    public Customer clone() throws CloneNotSupportedException {
        Object object;
        object = super.clone();
        return (Customer) object;
    }

    /**
     * 深克隆
     * @return Customer
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public Customer deepClone() throws IOException, ClassNotFoundException {
        // 将对象写入流中
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(this);

        // 将对象从流中取出
        ByteArrayInputStream byteArrayInputStream = new
                ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);

        return (Customer) objectInputStream.readObject();
    }
}

class Address implements Serializable {

    private String addressName;

    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }

    public String getAddressName() {
        return addressName;
    }
}
