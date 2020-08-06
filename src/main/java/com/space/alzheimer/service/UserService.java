package com.space.alzheimer.service;

import com.space.alzheimer.bean.CaseInfo;
import com.space.alzheimer.bean.Response;
import com.space.alzheimer.bean.User;
import com.space.alzheimer.bean.UserVo;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

/**
 * @ClassName UserService
 * @Description: TODO
 * @Author ljh
 * @Date 2020/5/16
 **/
public interface UserService {

    Response register(User user);

    Response login(User user, HttpSession session);

    Response updatePassword(User user);

    Response forgotPwd(User user);

    Map<String,Object> queryList(UserVo userVo);

    Map<String, Object> queryByName(UserVo userVo);

    Response updateUserState(User user);

    Response addUser(User user);

    Map<String, Object> findCaseList(CaseInfo caseInfo);
}