package com.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.BaseDao;
import com.model.User;
import com.service.UserService;
import com.util.ValidateUtil;
@Service("userService")
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {

	
	@Override
	@Resource(name="userDao")
	public void setDao(BaseDao<User> dao) {
		super.setDao(dao);
	}

	@Override
	public User validateInfo(String name, String password) {
		String hql = "from User u where u.name=? and u.password = ?";
		List<User> list = this.findEntityByHQL(hql, name, password);
		return ValidateUtil.isValid(list) == false ? null : list.get(0);
	}

	@Override
	public List<User> getUserList() {
		String hql = "from User";
		return findEntityByHQL(hql);
	}

	@Override
	public void toggleStatus(int uid) {
		User user = this.getEntity(uid);
		String hql = "update User u set u.opened = ? where u.id = ?";
		this.batchEntityByHQL(hql, !user.isOpened(), uid);
	}

	@Override
	public void updatePassword(User model) {
		String hql = "update User u set u.password = ? where u.id = ?";
		this.batchEntityByHQL(hql, model.getPassword(), model.getId());
	}

}
