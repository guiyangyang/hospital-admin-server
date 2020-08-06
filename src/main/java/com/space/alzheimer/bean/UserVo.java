package com.space.alzheimer.bean;

import lombok.Data;

@Data
public class UserVo extends User {

    private Integer pageSize;

    private Integer pageNo;


}