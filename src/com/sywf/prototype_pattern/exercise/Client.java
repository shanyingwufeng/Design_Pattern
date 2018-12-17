package com.sywf.prototype_pattern.exercise;

/**
 * Author: YiFan
 * Date: 2018/12/12 20:21
 * Description: 客户端
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {

        // 获取原型管理器对象，只需要唯一一个，使用单例模式（饿汉式）创建
        PrototypeManager prototypeManager = PrototypeManager.getInstance();

        DellNoteBook book1, book2, book3, book4;

        book1 = prototypeManager.getDellNoteBook("alien");
        book1.desc();

        book2 = prototypeManager.getDellNoteBook("alien");
        book2.desc();

        System.out.println(book1 == book2);

        book3 = prototypeManager.getDellNoteBook("xps");
        book3.desc();

        book4 = prototypeManager.getDellNoteBook("xps");
        book4.desc();

        System.out.println(book3 == book4);
    }
}
