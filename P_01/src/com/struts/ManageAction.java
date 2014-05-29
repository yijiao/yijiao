package com.struts;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.model.User;
import com.service.UserService;
import com.struts.interceptor.UserAware;
import com.util.DataUtil;

//管理用户
@Controller("manageAction")
@Scope("prototype")
public class ManageAction extends BaseAction<User> implements UserAware{

	//所有用户信息
	private List<User> userList;
	private int uid;
	private String comfirmPassword;
	@Resource(name="userService")
	private UserService userService;
	@Override
	public void setUser(User user) {
		model = user;
	}
	
	public String userListPage() {
		userList = userService.getUserList();
		return "userList";
	}
	
	public String toggleStatus() {
		userService.toggleStatus(uid);
		return "manageAction";
	}
	
	public String editPassword() {
		return "editPassword";
	}
	
	public String updatePassword() {
		if(!comfirmPassword.equals(model.getPassword())) {
			this.addFieldError("password", "密码不一致");
			return "input";
		}
		//目的是是获取model的manage属性
		model = userService.getEntity(model.getId());
		model.setPassword(DataUtil.md5(model.getPassword()));
		userService.updatePassword(model);
		if(model.isManage()) {
			return "manageAction";
		} else {
			return "updateSuccess";
		}
	}
	
	public List<User> getUserList() {
		return userList;
	}
	public void setUserList(List<User> userList) {
		this.userList = userList;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getComfirmPassword() {
		return comfirmPassword;
	}

	public void setComfirmPassword(String comfirmPassword) {
		this.comfirmPassword = comfirmPassword;
	}
	
	

}
