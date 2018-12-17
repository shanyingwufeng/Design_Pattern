package com.sywf.prototype_pattern.exercise;

/**
 * Author: YiFan
 * Date: 2018/12/12 19:52
 * Description: 抽象接口，提供clone()方法的实现
 */
public interface DellNoteBook extends Cloneable {

    DellNoteBook clone() throws CloneNotSupportedException;
    void desc();
}
