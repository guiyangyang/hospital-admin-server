package com.space.alzheimer;

import com.alibaba.fastjson.JSONObject;
import com.space.alzheimer.bean.CaseInfo;
import com.space.alzheimer.bean.User;
import com.space.alzheimer.service.UserService;
import com.space.alzheimer.util.SendEmailUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.DigestUtils;

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
public class UserTest {
    @Autowired
    private UserService userService;
    @Autowired
    private SendEmailUtil sendEmailUtil;

    @Test
    public void resitry(){
        User user = new User();
        user.setName("ljh01");
        user.setEmail("13312@qq.com");
        user.setPassword("abc123");
        user.setOrganization("组织");
        user.setOrganizationPhone("010-717727");
        user.setRole("common");
        user.setType("1");
        user.setState("0");

        userService.register(user);
    }

    @Test
    public void sendEmail() {
        try {
            sendEmailUtil.sendEmail("ljh8901@163.com","测试","我要成为世界首富");
        } catch (Exception e) {
            log.error("异常：{}",e.getMessage());
        }
    }

    @Test
    public void findCaseList() {
        CaseInfo ci = new CaseInfo();
        ci.setPageNo(1);
        ci.setPageSize(3);
        ci.setCaseNum("");
        ci.setF1_11("三");
        Map<String, Object> map = userService.findCaseList(ci);
        log.info(JSONObject.toJSONString(map));
    }

    public static void main(String[] args) {
        System.out.println(DigestUtils.md5DigestAsHex("abc123".getBytes()));
    }
}