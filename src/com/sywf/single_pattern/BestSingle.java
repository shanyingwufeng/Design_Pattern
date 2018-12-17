package com.sywf.single_pattern;

/**
 * Author: YiFan
 * Date: 2018/12/10 10:39
 * Description: 更好的单例类
 */
public class BestSingle {

    // 构造函数私有化
    private BestSingle() {}

    // 定义一个静态内部类，其中创建一个BestSingle实例
    public static class HolderClass {
        private static BestSingle instance = new BestSingle();
    }

    // 静态方法，返回instance对象
    public static BestSingle getInstance() {
        return HolderClass.instance;
    }

    public static void main(String[] args) {
        BestSingle instance1, instance2;
        instance1 = BestSingle.getInstance();
        instance2 = BestSingle.getInstance();
        System.out.println(instance1 == instance2);
    }
}
