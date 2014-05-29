package com.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.BaseDao;
import com.model.EducationMoney;
import com.service.AllTableService;
@Service("educationMoneyService")
public class EducationMoneyServiceImpl implements AllTableService {
	@Resource(name="educationMoneyDao")
	private BaseDao<EducationMoney> educationMoneyDao;

}
