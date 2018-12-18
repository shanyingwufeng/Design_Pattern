package com.sywf.factory_pattern.simple_factory.exercise;

/**
 * Author: YiFan
 * Date: 2018/12/10 19:34
 * Description: 客户端
 */
public class DrawingTool {

    public static void main(String[] args) {
        Shape s1, s2, s3, s4;
        try {
            s1 = ShapeFactory.createShape("圆形");
            s2 = ShapeFactory.createShape("方形");
            s3 = ShapeFactory.createShape("三角形");
            s4 = ShapeFactory.createShape("六边形");
            s1.draw();
            s1.erase();
            s2.draw();
            s2.erase();
            s3.draw();
            s3.erase();
            s4.draw();
            s4.erase();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}