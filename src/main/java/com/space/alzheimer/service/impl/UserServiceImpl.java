package com.space.alzheimer.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.space.alzheimer.bean.CaseInfo;
import com.space.alzheimer.bean.Response;
import com.space.alzheimer.bean.User;
import com.space.alzheimer.bean.UserVo;
import com.space.alzheimer.dao.UserMapper;
import com.space.alzheimer.mongo.MongoDataDao;
import com.space.alzheimer.service.UserService;
import com.space.alzheimer.util.NumsUtils;
import com.space.alzheimer.util.SendEmailUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/**
 * @ClassName UserServiceImpl
 * @Description: TODO
 * @Author ljh
 * @Date 2020/5/16
 **/
@Slf4j
@Service
public class UserServiceImpl implements UserService {

    private static final String MONGO_COLLECTION_NAME = "case";

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private SendEmailUtil sendEmailUtil;
    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public Response register(User user) {
        Response response = new Response();
        User userEx = userMapper.queryByName(user.getName());
        if (userEx != null){
            response.setCode("999");
            response.setMsg("该用户名已存在");
            return response;
        }
        try{
            String pwd = user.getPassword();
            user.setPassword(DigestUtils.md5DigestAsHex(pwd.getBytes()));
            userMapper.insert(user);
            response.setCode("200");
            response.setMsg("注册成功");
        }catch (Exception e){
            log.error("注册用户异常：{}",e.getMessage());
            response.setCode("999");
            response.setMsg("系统异常");
        }
        return response;
    }

    @Override
    public Response login(User user, HttpSession session) {
        Response response = new Response();
        User userEx = userMapper.queryByName(user.getName());
        if (userEx == null){
            response.setCode("999");
            response.setMsg("该用户不存在");
            return response;
        }

        if ("1".equals(userEx.getState())){
            response.setCode("999");
            response.setMsg("该用户被禁用");
            return response;
        }

        if (userEx.getPassword().equals(DigestUtils.md5DigestAsHex(user.getPassword().getBytes()))){
            session.setAttribute("loginUser",user.getName());
            response.setCode("200");
            response.setMsg("密码正确，登录成功");
            response.setUser(userEx);
        }else{
            response.setCode("999");
            response.setMsg("密码错误，登录失败");
        }
        return response;
    }

    @Override
    public Response updatePassword(User user) {
        Response response = new Response();
        User userEx = userMapper.queryByName(user.getName());
        if (userEx == null){
            response.setCode("999");
            response.setMsg("该用户不存在");
            return response;
        }

        if(!user.getPwdOne().equals(user.getPwdTwo())){
            response.setCode("999");
            response.setMsg("两次输入密码不同");
            return response;
        }

        userMapper.updatePassword(userEx.getId(), DigestUtils.md5DigestAsHex(user.getPwdOne().getBytes()));
        response.setCode("200");
        response.setMsg("修改密码成功");
        return response;
    }

    @Override
    public Response forgotPwd(User user) {
        Response response = new Response();
        User userEx = userMapper.queryByName(user.getName());
        if (userEx == null){
            response.setCode("999");
            response.setMsg("该用户不存在");
            return response;
        }

        String pwd = NumsUtils.getFlowNumber(8);
        userMapper.updatePassword(userEx.getId(), DigestUtils.md5DigestAsHex(pwd.getBytes()));
        try {
            sendEmailUtil.sendEmail(user.getEmail(),"密码重置",pwd);
            response.setCode("200");
            response.setMsg("密码已发送至邮箱，请注意查收");
        } catch (Exception e) {
            response.setCode("999");
            response.setMsg("密码重置失败");
        }
        return response;
    }

    @Override
    public Map<String,Object> queryList(UserVo userVo) {
        Map<String,Object> resultMap = new HashMap<>();
        Page page = PageHelper.startPage(userVo.getPageNo(), userVo.getPageSize());
        Page<User> list = userMapper.queryList(userVo);
        Long total = page.getTotal();
        resultMap.put("code", "200");
        resultMap.put("msg", "成功");
        resultMap.put("total", total);
        resultMap.put("list", list);
        return resultMap;
    }

    @Override
    public Map<String, Object> queryByName(UserVo userVo) {
        Map<String,Object> resultMap = new HashMap<>();
        Page page = PageHelper.startPage(userVo.getPageNo(), userVo.getPageSize());
        Page<User> list = userMapper.queryList(userVo);
        Long total = page.getTotal();
        resultMap.put("code", "200");
        resultMap.put("msg", "成功");
        resultMap.put("total", total);
        resultMap.put("list", list);
        return resultMap;
    }

    @Override
    public Response updateUserState(User user) {
        Response response = new Response();
        userMapper.updateUserState(user.getId(), user.getState());
        response.setCode("200");
        response.setMsg("修改用户状态成功");
        return response;
    }

    @Override
    public Response addUser(User user) {
        Response response = new Response();
        User userEx = userMapper.queryByName(user.getName());
        if (userEx != null){
            response.setCode("999");
            response.setMsg("该用户名已存在");
            return response;
        }
        try{
            String pwd = "abc123";
            user.setPassword(DigestUtils.md5DigestAsHex(pwd.getBytes()));
            userMapper.insert(user);
            response.setCode("200");
            response.setMsg("新增用户成功，使用默认密码即可登录");
        }catch (Exception e){
            log.error("新增用户异常：{}",e.getMessage());
            response.setCode("999");
            response.setMsg("新增用户系统异常");
        }
        return response;
    }

    @Override
    public Map<String, Object> findCaseList(CaseInfo caseInfo) {
        Map<String, Object> map = new HashMap<>();
        map.put("state","1"); // 0-暂存；1-保存
        if(StringUtils.isNotEmpty(caseInfo.getCaseNum())){
            map.put("caseNum",caseInfo.getCaseNum());
        }
        if(StringUtils.isNotEmpty(caseInfo.getF1_11())){
            map.put("f1_11",caseInfo.getF1_11());
        }

        Map<String, String> specifyField = new HashMap<>();
        specifyField.put("caseNum",null);
        specifyField.put("f1_11",null);
        specifyField.put("createTime",null);

        Criteria criteria = new Criteria();
        for(Map.Entry<String, Object> entry : map.entrySet()){
//            Pattern pattern= Pattern.compile("^.*"+entry.getValue()+".*$", Pattern.CASE_INSENSITIVE);
//            criteria.and(entry.getKey()).regex(pattern);
            criteria.and(entry.getKey()).is(entry.getValue());
        }
        Query query = new Query(criteria);

        for(Map.Entry<String, String> entry : specifyField.entrySet()){
            query.fields().include(entry.getKey());
        }
        query.skip((caseInfo.getPageNo()-1)*caseInfo.getPageSize())
                .limit(caseInfo.getPageSize());
        List<CaseInfo> list= mongoTemplate.find(query, CaseInfo.class, MONGO_COLLECTION_NAME);
        long totalSize = mongoTemplate.count(query, CaseInfo.class, MONGO_COLLECTION_NAME);

        map.clear();
        map.put("code","200");
        map.put("msg","成功");
        map.put("totalSize",totalSize);
        map.put("list",list);
        return map;
    }
}