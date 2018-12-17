package com.sywf.prototype_pattern;

import java.io.IOException;

/**
 * Author: YiFan
 * Date: 2018/12/12 10:02
 * Description: 客户端
 */
public class Client {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        // 创建原型对象
        NoteBook noteBook1 = new NoteBook();

        // 创建contact对象
        Contact contact = new Contact();

        // 设置contact的num属性
        contact.setNum(1);

        // 设置noteBook1对象的属性
        noteBook1.setId(1);
        noteBook1.setTitle("2017");
        noteBook1.setModel("22x22");

        System.out.println(noteBook1);

        // 将联系人contact添加到notebook1中
        noteBook1.setContact(contact);

        // 创建noteBook2引用变量
        NoteBook noteBook2;

        // 克隆noteBook1对象
//        noteBook2 = noteBook1.clone();
        // 调用deepClone()方法进行深克隆
        noteBook2 = noteBook1.deepClone();

        // 判断noteBook1和noteBook2指向的是否为同一个对象
        System.out.println("noteBook1和noteBook2指向的是否为同一个对象："
                + (noteBook1 == noteBook2));

        // 设置noteBook2对象的属性
        noteBook2.setId(2);
        noteBook2.setTitle("2018");

        System.out.println(noteBook2);

        // 判断noteBook1和noteBook2对象中的contact对象是否是同一个对象
        System.out.println("noteBook1和noteBook2对象中的contact对象是否是同一个对象："
                + (noteBook1.getContact() == noteBook2.getContact()));

        // noteBook2对象将contact中的num设置为2
        noteBook2.getContact().setNum(2);

        // 打印noteBook1对象中contact对象的num值
        System.out.println(noteBook1.getContact().getNum());
    }
}
