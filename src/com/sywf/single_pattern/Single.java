package com.sywf.single_pattern;

/**
 * Author: YiFan
 * Date: 2018/12/10 08:16
 * Description: 最简单的单例类
 */
public class Single {

    // 设置instance为静态变量
    private static Single instance = null;

    // 构造函数私有化
    private Single() {}

    // 静态方法-实例化对象
    public static Single getInstance() {
        if (instance == null) {
            // 实例化对象
            instance = new Single();
        }
        return instance;
    }

    public static void main(String[] args) {
        // 通过getInstance()方法获取实例
        Single instance1 = Single.getInstance();
        // 通过getInstance()方法获取实例
        Single instance2 = Single.getInstance();
        // 判断两个对象是否相同，相同则表示获取的是同一个实例，否则不是
        System.out.println(instance1 == instance2);
    }
}
