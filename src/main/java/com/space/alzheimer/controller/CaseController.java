package com.space.alzheimer.controller;

import com.alibaba.fastjson.JSONObject;
import com.space.alzheimer.bean.*;
import com.space.alzheimer.service.CaseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * @ClassName UserController
 * @Description: TODO
 * @Author ljh
 * @Date 2020/5/16
 **/
@Slf4j
@RestController
@RequestMapping("/case")
public class CaseController {

    private static final String location = "/project/uploadPic/";
//    private static final String location = "file:D://aaaa";

    @Autowired
    private CaseService caseService;

    @PostMapping(value = "/fileUpload")
    public Response fileUpload(@RequestParam(value = "file") MultipartFile file) {
        Response response = new Response();
        if (file.isEmpty()) {
            response.setCode("999");
            response.setMsg("上传图片为空");
            return response;
        }
        String fileName = file.getOriginalFilename();  // 文件名
        String suffixName = fileName.substring(fileName.lastIndexOf("."));  // 后缀名
        fileName = UUID.randomUUID() + suffixName; // 新文件名
        File dest = new File(location + fileName);
        if (!dest.getParentFile().exists()) {
            dest.getParentFile().mkdirs();
        }
        try {
            file.transferTo(dest);
            response.setCode("200");
            response.setMsg("上传图片成功");
            response.setPictureUrl("/uploadPic/" + fileName);
        } catch (IOException e) {
            log.error("图片上传异常：{}",e.getMessage());
            response.setCode("999");
            response.setMsg("上传图片异常");
        }
        return response;
    }

    @PostMapping(value = "/caseSave")
    public Object save(@RequestBody CaseInfo caseInfo){
        return caseService.save(caseInfo);
    }

    @PostMapping(value = "/updateCaseShare")
    public Object updateCaseShare(@RequestBody CaseInfo caseInfo){
        return caseService.updateCaseShare(caseInfo);
    }

    @PostMapping(value = "/findCaseList")
    public Object findCaseList(@RequestBody CaseInfo caseInfo){
        return caseService.findCaseList(caseInfo);
    }

    @PostMapping(value = "/findCaseDraftList")
    public Object findCaseDraftList(@RequestBody CaseInfo caseInfo){
        log.info("findCaseDraftList参数：{}", JSONObject.toJSONString(caseInfo));
        return caseService.findCaseDraftList(caseInfo);
    }

    @PostMapping(value = "/findCaseShareList")
    public Object findCaseShareList(@RequestBody CaseInfo caseInfo){
        log.info("findCaseShareList参数：{}", JSONObject.toJSONString(caseInfo));
        return caseService.findCaseShareList(caseInfo);
    }

    @PostMapping(value = "/queryUsersCaseCount")
    public Object queryUsersCaseCount(@RequestBody CaseInfo caseInfo){
        return caseService.queryUsersCaseCount(caseInfo);
    }

    @PostMapping(value = "/findCaseDetails")
    public Object findCaseDetails(@RequestBody CaseInfo caseInfo){
        return caseService.findCaseDetails(caseInfo);
    }

    @PostMapping(value = "/delCaseByArray")
    public Object delCaseByArray(@RequestBody CaseVo caseVo){
        return caseService.delCaseByArray(caseVo);
    }

    @PostMapping("/import")
    public Object importExcel(@RequestParam("file") MultipartFile file, HttpServletRequest request) {
        String userName = request.getParameter("userName");
        log.info("病例导入import参数userName={}", userName);
        return caseService.importExcel(file, userName);
    }

    @GetMapping("/export")
    public void export(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String caseNum = request.getParameter("caseNum");
        log.info("病例导入export参数caseNfindCaseShareListum={}", caseNum);
        caseService.export(response,caseNum);
    }

    @GetMapping("/excelTemplate")
    public void excelTemplate(HttpServletResponse response) throws Exception {
        caseService.excelTemplate(response);
    }


}