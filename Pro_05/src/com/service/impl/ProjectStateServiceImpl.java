package com.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.BaseDao;
import com.model.ProjectState;
import com.service.AllTableService;
@Service("projectStateService")
public class ProjectStateServiceImpl implements AllTableService {
	@Resource(name="projectStateDao")
	private BaseDao<ProjectState> projectStateDao;

}
