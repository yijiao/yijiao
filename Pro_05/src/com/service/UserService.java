package com.service;

import java.util.List;

import com.model.User;

public interface UserService extends BaseService<User> {

	public User validateInfo(String name, String password);

	public List<User> getUserList();

	public void toggleStatus(int uid);

	public void updatePassword(User model);
}
