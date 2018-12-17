package com.sywf.single_pattern;

/**
 * Author: YiFan
 * Date: 2018/12/10 09:18
 * Description: 饿汉式单例类
 */
public class EagerSingle {

    // 定义静态变量instance，在类加载的时候已经将其实例化，只能在类内部调用
    private static EagerSingle instance = new EagerSingle();

    // 构造函数私有化-只能从类内部访问
    private EagerSingle() {}

    // 定义静态方法-获取instance对象，供类外部访问调用
    public static EagerSingle getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        // 调用getInstance()方法获取实例
        EagerSingle instance1 = EagerSingle.getInstance();
        // 调用getInstance()方法获取实例
        EagerSingle instance2 = EagerSingle.getInstance();
        // 判断两次获取的实例是否相同
        System.out.println(instance1 == instance2);
    }
}
