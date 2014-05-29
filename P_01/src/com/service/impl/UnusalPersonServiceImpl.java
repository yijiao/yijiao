package com.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.BaseDao;
import com.model.UnusalPerson;
import com.service.AllTableService;
@Service("unusalPersonService")
public class UnusalPersonServiceImpl implements AllTableService {
	@Resource(name="unusalPersonDao")
	private BaseDao<UnusalPerson> unusalPersonDao;

}
