package com.example.boot.model;

/**
 * 用户信息
 */


public class UserInfo {
    /**
     * 主键
     */
    private String id;
    /**
     * 用户名
     */

    private String userName;
    /**
     * 密码
     */
    private String password;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
