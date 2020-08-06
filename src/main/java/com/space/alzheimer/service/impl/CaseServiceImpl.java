package com.space.alzheimer.service.impl;

import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ImportParams;
import cn.afterturn.easypoi.excel.entity.result.ExcelImportResult;
import com.space.alzheimer.bean.CaseInfo;
import com.space.alzheimer.bean.CaseVo;
import com.space.alzheimer.mongo.MongoDataDao;
import com.space.alzheimer.service.CaseService;
import com.space.alzheimer.util.ExcelUtiles;
import com.space.alzheimer.util.NumsUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.util.*;

/**
 * @ClassName CaseServiceImpl
 * @Description: TODO
 * @Author ljh
 * @Date 2020/5/23
 **/
@Service
@Slf4j
public class CaseServiceImpl implements CaseService {

    private static final String MONGO_COLLECTION_NAME = "case";

    @Autowired
    private MongoDataDao mongoDataDao;
    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public Map<String, Object> save(CaseInfo caseInfo) {

        Map<String, Object> map = new HashMap<>();
        Date date = new Date();
        try{
            // share 0-未共享；1-已共享
            String caseNum = caseInfo.getCaseNum();
            if (StringUtils.isEmpty(caseNum)){
                caseNum = NumsUtils.getCaseNumber();
                caseInfo.setCaseNum(caseNum);
                caseInfo.setCreateTime(date);
                mongoDataDao.insert(caseInfo,MONGO_COLLECTION_NAME);
            }else{
                caseInfo.setUpdateTime(new Date());
                mongoDataDao.delete(MONGO_COLLECTION_NAME, CaseInfo.class,caseNum);
                mongoDataDao.insert(caseInfo,MONGO_COLLECTION_NAME);
            }
            map.put("code","200");
            map.put("msg","存储成功");
            map.put("caseNum",caseNum);
            map.put("createTime",date);
        }catch (Exception e){
            log.error("存储异常：{}",e.getMessage());
            map.put("code","999");
            map.put("msg","存储失败");
            map.put("caseNum",null);
            map.put("createTime",null);



        }
        return map;
    }

    @Override
    public Map<String, Object> updateCaseShare(CaseInfo caseInfo) {
        Map<String, Object> map = new HashMap<>();
        try{
            // share 0-未共享；1-已共享
            map.put("share", caseInfo.getShare());
            mongoDataDao.update(caseInfo.getCaseNum(),map,MONGO_COLLECTION_NAME);
            map.clear();
            map.put("code","200");
            map.put("msg","分享成功");
        }catch (Exception e){
            log.error("分享异常：{}",e.getMessage());
            map.clear();
            map.put("code","999");
            map.put("msg","分享失败");
        }
        return map;
    }

    @Override
    public Map<String, Object> findCaseList(CaseInfo caseInfo) {
        Map<String, Object> map = new HashMap<>();
        try{
            map.put("userName",caseInfo.getUserName());
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
            specifyField.put("share",null);
            specifyField.put("createTime",null);

            Query query = null;
            Criteria criteria = new Criteria();
            for(Map.Entry<String, Object> entry : map.entrySet()){
                criteria.and(entry.getKey()).is(entry.getValue());
            }
            query = new Query(criteria);

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
        }catch (Exception e){
            log.error("findCaseList查询异常：{}", e.getMessage());
            map.clear();
            map.put("code","999");
            map.put("msg","异常");
            map.put("totalSize",null);
            map.put("list",null);
        }
        return map;
    }

    @Override
    public Map<String, Object> findCaseDraftList(CaseInfo caseInfo) {
        Map<String, Object> map = new HashMap<>();
        try{
            map.put("userName",caseInfo.getUserName());
            map.put("state","0"); // 0-暂存；1-保存
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
        }catch (Exception e){
            log.error("findCaseDraftList查询异常：{}", e.getMessage());
            map.clear();
            map.put("code","999");
            map.put("msg","异常");
            map.put("totalSize",null);
            map.put("list",null);
        }
        return map;
    }

    @Override
    public Map<String, Object> findCaseShareList(CaseInfo caseInfo) {
        Map<String, Object> map = new HashMap<>();
        try{
            map.put("share","1"); // 0-未共享；1-已共享
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
            criteria.and("userName").ne(caseInfo.getUserName());
            for(Map.Entry<String, Object> entry : map.entrySet()){
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
        }catch (Exception e){
            log.error("findCaseShareList查询异常：{}", e.getMessage());
            map.clear();
            map.put("code","999");
            map.put("msg","异常");
            map.put("totalSize",null);
            map.put("list",null);
        }
        return map;
    }

    @Override
    public Map<String, Object> queryUsersCaseCount(CaseInfo caseInfo) {
        Map<String, Object> map = new HashMap<>();
        try{
            Criteria criteria = new Criteria();
            criteria.and("userName").is(caseInfo.getUserName());
            Query query = new Query(criteria);
            long totalSize = mongoTemplate.count(query, CaseInfo.class, MONGO_COLLECTION_NAME);
            map.clear();
            map.put("code","200");
            map.put("msg","成功");
            map.put("count",totalSize);
        }catch (Exception e){
            log.error("queryUsersCaseCount查询异常：{}", e.getMessage());
            map.clear();
            map.put("code","999");
            map.put("msg","异常");
            map.put("count",null);
        }
        return map;
    }

    @Override
    public Map<String, Object> findCaseDetails(CaseInfo caseInfo) {
        Map<String, Object> map = new HashMap<>();
        CaseInfo caseInfoResult = null;
        try{
            Criteria criteria = new Criteria();
            criteria.and("caseNum").is(caseInfo.getCaseNum());
            Query query = new Query(criteria);
            List<CaseInfo> list= mongoTemplate.find(query, CaseInfo.class, MONGO_COLLECTION_NAME);
            if (CollectionUtils.isNotEmpty(list)){
                caseInfoResult = list.get(0);
            }
            map.clear();
            map.put("code","200");
            map.put("msg","成功");
            map.put("details",caseInfoResult);
        }catch (Exception e){
            log.error("queryUsersCaseCount查询异常：{}", e.getMessage());
            map.clear();
            map.put("code","999");
            map.put("msg","异常");
            map.put("details",null);
        }
        return map;
    }

    @Override
    public Map<String, Object> delCaseByArray(CaseVo caseVo) {
        Map<String, Object> map = new HashMap<>();
        CaseInfo caseInfoResult = null;
        try{
            Criteria criteria = new Criteria();
            criteria.and("caseNum").in(caseVo.getDelArray());
            Query query = new Query(criteria);
            mongoTemplate.remove(query, CaseInfo.class, MONGO_COLLECTION_NAME);
            map.clear();
            map.put("code","200");
            map.put("msg","删除成功");
            map.put("details",caseInfoResult);
        }catch (Exception e){
            log.error("delCaseByArray查询异常：{}", e.getMessage());
            map.clear();
            map.put("code","999");
            map.put("msg","删除异常");
            map.put("details",null);
        }
        return map;
    }

    @Override
    public Map<String, Object> importExcel(MultipartFile file, String userName) {
        Map<String, Object> map = new HashMap<>();
        if(StringUtils.isEmpty(userName)){
            map.put("code","999");
            map.put("msg","excel导入失败,userName为空");
            return map;
        }
        ImportParams importParams = new ImportParams();
        // 数据处理
        importParams.setHeadRows(1);
        importParams.setTitleRows(1);
//         需要验证
//        importParams.setNeedVerfiy(true);

        try {
//            FileInputStream fis = new FileInputStream("D:/aaaa/病例模板.xls");
//            ExcelImportResult<CaseInfo> result = ExcelImportUtil.importExcelMore(fis,
//                    CaseInfo.class, importParams);

            ExcelImportResult<CaseInfo> result = ExcelImportUtil.importExcelMore(file.getInputStream(),
                    CaseInfo.class, importParams);
            List<CaseInfo> successList = result.getList();
            if (CollectionUtils.isNotEmpty(successList)){
                Date date = new Date();
                List<CaseInfo> targetList = new ArrayList<>();
                for (CaseInfo vo : successList){
                    if (StringUtils.isEmpty(vo.getF1_11())){
                        continue;
                    }
                    vo.setCaseNum(NumsUtils.getCaseNumber());
                    vo.setUserName(userName);
                    vo.setShare("0");
                    vo.setState("1");
                    vo.setCreateTime(date);
                    targetList.add(vo);
                }
                if (CollectionUtils.isNotEmpty(targetList)){
                    mongoDataDao.insertBatch(targetList, MONGO_COLLECTION_NAME);
                }
            }
            map.put("code","200");
            map.put("msg","excel导入成功");
        } catch (Exception e) {
            log.error("excel导入异常：{}",e.getMessage());
            map.put("code","999");
            map.put("msg","excel导入失败");
        }
        return map;
    }

    @Override
    public void export(HttpServletResponse response,String caseNum) throws Exception{
        Map<String, Object> map = new HashMap<>();
        map.put("caseNum", caseNum);
        List<CaseInfo> list = (List<CaseInfo>) mongoDataDao.findList(map, MONGO_COLLECTION_NAME, CaseInfo.class);
        ExcelUtiles.exportExcel(list, "病例详情", "病例", CaseInfo.class, "导出病例.xls", response);

    }

    @Override
    public void excelTemplate(HttpServletResponse response) throws Exception{
        ExcelUtiles.exportExcel(new ArrayList<CaseInfo>(), "病例表格", "病例", CaseInfo.class, "病例模板.xls", response);
    }
}