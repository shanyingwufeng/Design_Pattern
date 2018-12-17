package com.sywf.prototype_pattern;

import java.io.*;

/**
 * Author: YiFan
 * Date: 2018/12/12 09:53
 * Description: 具体原型类-笔记本
 */
// 实现Serializable接口表示该类可以被序列化
public class NoteBook implements Cloneable, Serializable {

    // 笔记本ID
    private int id;

    // 笔记本标题
    private String title;

    // 笔记本模型
    private String model;

    // 笔记本联系人-引用数据类型
    private Contact contact;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Contact getContact() {
        return contact;
    }

    @Override
    public String toString() {
        return "笔记本ID：" + id + "，笔记本标题：" + title + ", 笔记本模型：" + model;
    }

    // 重写Object类中的clone()方法实现对象的克隆
    @Override
    public NoteBook clone() throws CloneNotSupportedException {
        Object object;
        object = super.clone();
        return (NoteBook) object;
    }

    // 使用序列化技术进行深克隆
    public NoteBook deepClone() throws IOException, ClassNotFoundException {
        // 将对象写入流中
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(this);

        // 将对象从流中取出
        ByteArrayInputStream byteArrayInputStream = new
                ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);

        return (NoteBook) objectInputStream.readObject();
    }
}

// 笔记本的联系人
class Contact implements Serializable {

    private int num;

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }
}
