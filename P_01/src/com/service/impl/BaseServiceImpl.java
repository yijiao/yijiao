package com.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.dao.BaseDao;
import com.service.BaseService;

public abstract class BaseServiceImpl<T> implements BaseService<T> {

	private BaseDao<T> dao;

	@Resource
	public void setDao(BaseDao<T> dao) {
		this.dao = dao;
	}

	@Override
	public void saveEntity(T t) {

		dao.saveEntity(t);
	}

	@Override
	public void saveOrUpdateEntity(T t) {

		dao.saveOrUpdateEntity(t);
	}

	@Override
	public void updateEntity(T t) {
		// TODO Auto-generated method stub
		dao.updateEntity(t);
	}

	@Override
	public void deleteEntity(T t) {
		// TODO Auto-generated method stub
		dao.deleteEntity(t);
	}

	@Override
	public void batchEntityByHQL(String hql, Object... objects) {
		// TODO Auto-generated method stub
		dao.batchEntityByHQL(hql, objects);
	}

	@Override
	public T loadEntity(Integer id) {
		// TODO Auto-generated method stub
		return dao.loadEntity(id);
	}

	@Override
	public T getEntity(Integer id) {
		// TODO Auto-generated method stub
		return dao.getEntity(id);
	}

	@Override
	public List<T> findEntityByHQL(String hql, Object... objects) {
		// TODO Auto-generated method stub
		return dao.findEntityByHQL(hql, objects);
	}
	
	
	
	
}
