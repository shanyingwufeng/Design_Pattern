package com.sywf.build_pattern.exercise;

/**
 * Author: YiFan
 * Date: 2018/12/13 16:26
 * Description:
 */
public class Client {

    public static void main(String[] args) {

        // 创建Director对象
        Director director = new Director();

        // 创建Appearance三个引用变量
        Appearance appearance1, appearance2, appearance3;

        // 建造者通过完整模式构建外观
        appearance1 = director.construct(new FullMode());

        // 建造者通过精简模式构建外观
        appearance2 = director.construct(new ReducedMode());

        // 建造者通过记忆模式构建外观
        appearance3 = director.construct(new MemoryMode());

        System.out.println(appearance1);
        System.out.println(appearance2);
        System.out.println(appearance3);
    }
}
