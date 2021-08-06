package com.deng.entity;

import java.io.Serializable;

/**
 * (TestUser)实体类
 *
 * @author makejava
 * @since 2021-08-06 10:43:26
 */
public class TestUser implements Serializable {
    private static final long serialVersionUID = 471512575066258714L;

    private Integer uid;

    private String uname;

    private String upassword;


    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpassword() {
        return upassword;
    }

    public void setUpassword(String upassword) {
        this.upassword = upassword;
    }

}
