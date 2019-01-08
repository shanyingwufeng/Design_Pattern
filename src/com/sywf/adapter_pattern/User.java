package com.sywf.adapter_pattern;

/**
 * Author: YiFan
 * Date: 2018/12/17 22:42
 * Description: 用户类
 */
public class User {

    // 用户昵称
    private String nickname;

    // 用户口令
    private String password;

    // 用户电话
    private String tel;

    // 用户邮箱
    private String email;

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
