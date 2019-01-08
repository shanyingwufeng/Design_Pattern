package com.sywf.adapter_pattern;

import com.sywf.adapter_pattern.util.MD5Util;

/**
 * Author: YiFan
 * Date: 2018/12/17 12:31
 * Description: 适配者类
 */
public class Adaptee {

    /**
     * 通过MD5算法加密用户信息
     * @param info 用户口令、邮箱
     * @return 加密的用户口令、邮箱
     */
    public String informationEncryptionByMD5(String info) {
        return MD5Util.MD5(info);
    }
}
