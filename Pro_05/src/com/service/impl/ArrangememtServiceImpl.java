package com.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.BaseDao;
import com.model.Arrangement;
import com.service.AllTableService;
@Service("arrangememtService")
public class ArrangememtServiceImpl implements AllTableService {

	@Resource(name="arrangementDao")
	private BaseDao<Arrangement> arrangementDao;
}
