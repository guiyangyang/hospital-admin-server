package com.space.alzheimer.bean;

import lombok.Data;

@Data
public class User {

    private String id;

    private String name;

    private String email;

    private String password;

    private String organization;

    private String organizationPhone;

    private String type;// 1:个人 2：组织机构

    private String role;// admin:管理员  common:普通用户

    private String state;// 0-正常；1-禁用

    private String createTime;

    private String updateTime;

    private String pwdOne;
    private String pwdTwo;


}