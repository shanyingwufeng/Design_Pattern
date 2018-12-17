package com.sywf.single_pattern;

/**
 * Author: YiFan
 * Date: 2018/12/10 09:28
 * Description: 懒汉式单例类
 */
public class LazySingle {

    // 设置instance为静态变量
    private volatile static LazySingle instance = null;

    // 构造函数私有化
    private LazySingle() {}

    // 静态方法-实例化对象，使用sychronized关键字，保证同一时刻只可一个线程使用getInstance()方法
    public static LazySingle getInstance() {
        if (instance == null) {
            synchronized (LazySingle.class) {
                if (instance == null) {
                    instance = new LazySingle();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        // 调用getInstance()方法获取实例
        LazySingle instance1 = LazySingle.getInstance();
        // 调用getInstance()方法获取实例
        LazySingle instance2 = LazySingle.getInstance();
        // 判断两次获取的实例是否相同
        System.out.println(instance1 == instance2);
    }
}
