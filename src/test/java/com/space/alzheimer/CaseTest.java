package com.space.alzheimer;

import com.alibaba.fastjson.JSONObject;
import com.space.alzheimer.bean.CaseInfo;
import com.space.alzheimer.bean.CaseVo;
import com.space.alzheimer.bean.User;
import com.space.alzheimer.service.CaseService;
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
public class CaseTest {
    @Autowired
    private CaseService caseService;

    @Test
    public void importExcel() {
        try {
            caseService.importExcel(null,"ljh");
        } catch (Exception e) {
            log.error("异常：{}",e.getMessage());
        }
    }

    @Test
    public void test() {
        CaseInfo ci = new CaseInfo();
        ci.setPageNo(1);
        ci.setPageSize(5);
        ci.setCaseNum("");
        ci.setF1_11("");
        ci.setUserName("admin1");
        Map<String, Object> map = caseService.findCaseShareList(ci);
        log.info(JSONObject.toJSONString(map));
    }


    @Test
    public void delByArray() {
        String[] array = {"20200529175134SO9DFO","202005291751349HIA76"};
        CaseVo vo = new CaseVo();
        vo.setDelArray(array);
        Map<String, Object> map = caseService.delCaseByArray(vo);
        log.info(JSONObject.toJSONString(map));
    }

}