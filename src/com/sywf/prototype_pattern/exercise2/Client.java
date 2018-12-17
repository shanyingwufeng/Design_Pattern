package com.sywf.prototype_pattern.exercise2;

import java.io.IOException;

/**
 * Author: YiFan
 * Date: 2018/12/12 21:29
 * Description: 客户端
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {

        // 创建customer1对象
        Customer customer1 = new Customer();

        // 创建address对象
        Address address = new Address();

        address.setAddressName("customer_address");

        // 设置customer1的属性
        customer1.setName("a");
        customer1.setAge(1);
        customer1.setAddress(address);

        // 创建customer2和customer3引用变量
        Customer customer2, customer3;

        // 克隆customer1对象（浅克隆）
        customer2 = customer1.clone();

        // 浅克隆-所以address引用类型变量只是拷贝内存地址
        System.out.println("customer1中引用类型address变量是否与customer2中相同："
                + (customer1.getAddress() == customer2.getAddress()));

        // 设置customer2属性
        customer2.setAge(2);

        // 克隆customer1对象（深克隆）
        customer3 = customer1.deepClone();

        // 深克隆-即拷贝值类型变量，也拷贝引用类型变量
        System.out.println("customer1中引用类型address变量是否与customer3中相同："
                + (customer1.getAddress() == customer3.getAddress()));
    }
}
