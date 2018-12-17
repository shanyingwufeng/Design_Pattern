package com.sywf.prototype_pattern.exercise;

/**
 * Author: YiFan
 * Date: 2018/12/12 19:56
 * Description: 外星人笔记本
 */
public class AlienNoteBook implements DellNoteBook {

    @Override
    public DellNoteBook clone() throws CloneNotSupportedException {
        Object object;
        object = super.clone();
        return (DellNoteBook) object;
    }

    @Override
    public void desc() {
        System.out.println("外星人笔记本");
    }
}
