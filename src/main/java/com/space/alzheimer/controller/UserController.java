package com.space.alzheimer.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.space.alzheimer.bean.CaseInfo;
import com.space.alzheimer.bean.Response;
import com.space.alzheimer.bean.User;
import com.space.alzheimer.bean.UserVo;
import com.space.alzheimer.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @ClassName UserController
 * @Description: TODO
 * @Author ljh
 * @Date 2020/5/16
 **/
@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("register")
    public Object register(@RequestBody User user){
        return userService.register(user);
    }

    @RequestMapping("login")
    public Object login(@RequestBody User user,HttpSession session){
        return userService.login(user,session);
    }

    @RequestMapping("logout")
    public Object logout(HttpSession session){
        session.invalidate();
        Response response = new Response("200","登出成功",null,null);
        return response;
    }

    @RequestMapping("updatePassword")
    public Object updatePassword(@RequestBody User user){
        return userService.updatePassword(user);
    }

    @RequestMapping("forgotPwd")
    public Object forgotPwd(@RequestBody User user){
        return userService.forgotPwd(user);
    }

    @RequestMapping("list")
    public Map<String,Object> queryList(@RequestBody UserVo userVo){
        return userService.queryList(userVo);
    }

    @RequestMapping("queryByName")
    public Map<String,Object> queryByName(@RequestBody UserVo userVo){
        return userService.queryByName(userVo);
    }

    @RequestMapping("updateUserState")
    public Object updateUserState(@RequestBody User user){
        return userService.updateUserState(user);
    }

    @RequestMapping("addUser")
    public Object addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @PostMapping(value = "/findCaseList")
    public Object findCaseList(@RequestBody CaseInfo caseInfo){
        return userService.findCaseList(caseInfo);
    }


}