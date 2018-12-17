package com.sywf.adapter_pattern;

/**
 * Author: YiFan
 * Date: 2018/12/17 12:34
 * Description: 客户端测试类
 */
public class Client {

    public static void main(String[] args) {

        User user = new User();
        user.setPassword("123456789");
        user.setEmail("xyfaqq@163.com");

        // 针对接口编程
        IDataBaseOperation dataBaseOperation;
        // 实例化对象
        dataBaseOperation = new EncryptionAdapter();

        // 加密的用户密码
        String passwordEncryption = dataBaseOperation.informationEncryption(user.getPassword());

        // 加密的用户邮箱
        String emailEncryption = dataBaseOperation.informationEncryption(user.getEmail());

        System.out.println("加密前用户口令：" + user.getPassword() + "，加密后用户口令：" + passwordEncryption);

        System.out.println("加密前用户邮箱：" + user.getEmail() + ", 加密后用户邮箱：" + emailEncryption);
    }
}
