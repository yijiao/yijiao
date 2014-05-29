package com.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.BaseDao;
import com.model.TeacherTeam;
import com.service.AllTableService;
@Service("teacherTeamService")
public class TeacherTeamServiceImpl implements AllTableService {
	@Resource(name="teacherTeamDao")
	private BaseDao<TeacherTeam> teacherTeamDao;

}
