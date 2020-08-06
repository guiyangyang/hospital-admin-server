package com.space.alzheimer.service;

import com.space.alzheimer.bean.CaseInfo;
import com.space.alzheimer.bean.CaseVo;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * @ClassName CaseService
 * @Description: TODO
 * @Author ljh
 * @Date 2020/5/23
 **/
public interface CaseService {

    Map<String, Object> save(CaseInfo caseInfo);

    Map<String, Object> updateCaseShare(CaseInfo caseInfo);

    Map<String, Object>  findCaseList(CaseInfo caseInfo);

    Map<String, Object> findCaseDraftList(CaseInfo caseInfo);

    Map<String, Object> findCaseShareList(CaseInfo caseInfo);

    Map<String, Object> queryUsersCaseCount(CaseInfo caseInfo);

    Map<String, Object> findCaseDetails(CaseInfo caseInfo);

    Map<String, Object> delCaseByArray(CaseVo caseVo);

    Map<String, Object> importExcel(MultipartFile file, String userName);

    void export(HttpServletResponse response,String caseNum)throws Exception;

    void excelTemplate(HttpServletResponse response) throws Exception;
}