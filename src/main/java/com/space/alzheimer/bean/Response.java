package com.space.alzheimer.bean;

import lombok.*;


/**
 * @ClassName Response
 * @Description: TODO
 * @Author ljh
 * @Date 2020/5/18
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Response {
    private String code;
    private String msg;
    private User user;
    private String pictureUrl;
}