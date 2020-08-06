package com.space.alzheimer;

import com.alibaba.fastjson.JSONObject;
import com.space.alzheimer.bean.User;
import com.space.alzheimer.mongo.MongoDataDao;
import com.space.alzheimer.service.UserService;
import com.space.alzheimer.util.SendEmailUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.DigestUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName UserTest
 * @Description: TODO
 * @Author ljh
 * @Date 2020/5/18
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class MongoTest {
    @Autowired
    private MongoDataDao mongoDataDao;

    @Test
    public void insert(){
        User user = new User();
        user.setName("ljh02");
        user.setEmail("13312@qq.com");
        user.setPassword("abc123");
        user.setOrganization("组织");
        user.setOrganizationPhone("010-717727");
        user.setRole("common");
        user.setType("1");
        user.setState("0");

        mongoDataDao.insert(user,"user");
    }

    @Test
    public void find(){
        Map<String, Object> map = new HashMap<>();
        map.put("name","ljh01");
        List<User> list = (List<User>) mongoDataDao.findList(map,"user",User.class);
        System.out.println(JSONObject.toJSONString(list));
    }

    @Test
    public void del(){
        Map<String, Object> map = new HashMap<>();
        map.put("name","ljh01");
        mongoDataDao.delete("user",User.class,"5ec8d78f3717793e34a47aa6");
    }
}