package com.sywf.adapter_pattern;

/**
 * Author: YiFan
 * Date: 2018/12/17 12:29
 * Description: 数据库操作接口
 */
public interface IDataBaseOperation {

    /**
     * 用户信息加密
     * @param info 用户口令、邮箱
     * @return 加密后的用户口令、邮箱
     */
    String informationEncryption(String info);
}
