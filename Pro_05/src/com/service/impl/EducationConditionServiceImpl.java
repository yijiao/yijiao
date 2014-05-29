package com.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.BaseDao;
import com.model.EducationCondition;
import com.service.AllTableService;
@Service("educationConditionService")
public class EducationConditionServiceImpl implements AllTableService {
	@Resource(name="educationConditionDao")
	private BaseDao<EducationCondition> educationConditionDao;

}
