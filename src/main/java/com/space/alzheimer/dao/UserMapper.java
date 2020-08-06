package com.space.alzheimer.dao;

import com.github.pagehelper.Page;
import com.space.alzheimer.bean.User;
import com.space.alzheimer.bean.UserVo;
import org.apache.ibatis.annotations.Param;


/**
 * @ClassName UserDao
 * @Description: TODO
 * @Author ljh
 * @Date 2020/5/18
 **/
public interface UserMapper {

    User queryByName(@Param("userName") String name);

    void insert(User user);

    void updatePassword(@Param("id")String id, @Param("password") String pwdOne);

    Page<User> queryList(UserVo userVo);

    void updateUserState(@Param("id")String id, @Param("state")String state);
}