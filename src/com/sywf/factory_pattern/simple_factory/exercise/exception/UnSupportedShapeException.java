package com.sywf.factory_pattern.simple_factory.exercise.exception;

/**
 * Author: YiFan
 * Date: 2018/12/10 19:43
 * Description: 自定义异常
 */
public class UnSupportedShapeException extends Exception {

    public UnSupportedShapeException(String message) {
        super(message);
    }
}
