package com.sywf.factory_pattern.simple_factory.exercise;

import com.sywf.factory_pattern.simple_factory.exercise.exception.UnSupportedShapeException;

/**
 * Author: YiFan
 * Date: 2018/12/10 19:27
 * Description: 工厂角色
 */
public class ShapeFactory {

    // 静态工厂方法
     public static Shape createShape(String type) throws UnSupportedShapeException {
         Shape shape;
         if ("圆形".equals(type)) {
             shape = new Round();
         } else if ("方形".equals(type)) {
             shape = new Square();
         } else if ("三角形".equals(type)) {
             shape = new Triangle();
         } else {
             throw new UnSupportedShapeException("UnSupportedShapeException");
         }
         return shape;
     }
}
