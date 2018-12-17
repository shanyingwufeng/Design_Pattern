package com.sywf.prototype_pattern.exercise;

import java.util.HashMap;

/**
 * Author: YiFan
 * Date: 2018/12/12 20:14
 * Description: 原型管理器（使用饿汉式单例实现）
 */
public class PrototypeManager {

    private HashMap<String, DellNoteBook> ht = new HashMap<>();
    private static PrototypeManager pm = new PrototypeManager();

    // 为HashTable增加笔记本对象
    private PrototypeManager() {
        ht.put("alien", new AlienNoteBook());
        ht.put("xps", new XPSNoteBook());
    }

    // 增加新的笔记本
    public void addDellNoteBook(String key, DellNoteBook dellNoteBook) {
        ht.put(key, dellNoteBook);
    }

    public DellNoteBook getDellNoteBook(String key) throws CloneNotSupportedException {
        return ht.get(key).clone();
    }

    public static PrototypeManager getInstance() {
        return pm;
    }
}
