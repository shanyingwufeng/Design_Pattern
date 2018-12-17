package com.sywf.prototype_pattern.exercise;

/**
 * Author: YiFan
 * Date: 2018/12/12 19:58
 * Description: XPS笔记本
 */
public class XPSNoteBook implements DellNoteBook {

    @Override
    public DellNoteBook clone() throws CloneNotSupportedException {
        Object object;
        object = super.clone();
        return (DellNoteBook) object;
    }

    @Override
    public void desc() {
        System.out.println("XPS笔记本");
    }
}
