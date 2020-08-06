/*
 * create by songkailiang
 */
package com.space.alzheimer.mongo;


import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;
import com.space.alzheimer.bean.CaseInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


/**
 * @author
 */
@Repository
public class MongoDataDao {

    /**
     * 由springboot自动注入，默认配置会产生mongoTemplate这个bean
     */
    @Autowired
    private MongoTemplate mongoTemplate;

    public void insert(Object object, String collectionName){
		mongoTemplate.insert(object, collectionName);
	}

	public void insertBatch(List<CaseInfo> targetList, String mongoCollectionName) {
		mongoTemplate.insert(targetList, mongoCollectionName);
	}

	public Object findList(Map<String, Object> map, String collectionName, Class cla){
		if(collectionName == null){
			return null;
		}
		Query query = null;
		if (map != null && map.size() > 0){
			Criteria criteria = new Criteria();
			for(Entry<String, Object> entry : map.entrySet()){
				criteria.and(entry.getKey()).is(entry.getValue());
			}
			query = new Query(criteria);
		}else{
			query = new Query();
		}
        List<Object> list = mongoTemplate.find(query, cla, collectionName);
        return list;
		 
	}


	public Object findListFields(Map<String, Object> map,Map<String, String> specifyField, String collectionName, Class cla){
		if(collectionName == null){
			return null;
		}
		Query query = null;
		if (map != null && map.size() > 0){
			Criteria criteria = new Criteria();
			for(Entry<String, Object> entry : map.entrySet()){
				criteria.and(entry.getKey()).is(entry.getValue());
			}
			query = new Query(criteria);
		}else{
			query = new Query();
		}
		if (specifyField != null && specifyField.size() > 0){
			for(Entry<String, String> entry : specifyField.entrySet()){
				query.fields().include(entry.getKey());
			}
		}
		List<Object> list = mongoTemplate.find(query, cla, collectionName);
		return list;

	}

	public Object findListByArray(String[] array, String collectionName, Class cla){
		if(array == null || collectionName == null){
			return null;
		}
		Query query = new Query(Criteria.where("caseNum").in(array));
		List<Object> list = mongoTemplate.find(query, cla, collectionName);
		return list;

	}

	public Object findListByArrayAndFields(String[] array, Map<String, String> specifyField, String collectionName, Class cla){
		if(array == null || collectionName == null || specifyField == null){
			return null;
		}
		Query query = new Query(Criteria.where("caseNum").in(array));
		for(Entry<String, String> entry : specifyField.entrySet()){
			query.fields().include(entry.getKey());
		}
		List<Object> list = mongoTemplate.find(query, cla, collectionName);
		return list;

	}

	public void delete(String collectionName, Class cla, String caseNum){
		Query query = new Query();
		query.addCriteria(Criteria.where("caseNum").is(caseNum));
		DeleteResult deleteResult = mongoTemplate.remove(query,cla,collectionName);
	}
	

	public Long update(String caseNum, Map<String, Object> map, String collectionName) {
		Criteria criteria = Criteria.where("caseNum").is(caseNum);
		Query query = new Query(criteria);
		Update update = new Update();

		for(Entry<String, Object> entry : map.entrySet()){
			if (entry.getValue() != null) {
				update.set(entry.getKey(), entry.getValue());
			}
        }
		
		UpdateResult updateResult = mongoTemplate.updateMulti(query, update, collectionName);
		return updateResult.getModifiedCount();
	}

}