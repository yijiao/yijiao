package com.struts;

import java.util.Map;

import javax.annotation.Resource;

import org.apache.struts2.interceptor.SessionAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.model.User;
import com.service.UserService;
import com.util.DataUtil;
import com.util.ValidateUtil;
@Controller("loginAction")
@Scope("prototype")
public class LoginAction extends BaseAction<User> implements SessionAware {

	@Resource(name="userService")
	private UserService userService;
	private Map<String, Object> sessionMap;
	private String securityCode;
	public String toLoginPage() {
		return "LoginPage";
	}
	
	public String doLogin() {
		return "success";
	}

	public void validateDoLogin() {
		String serverCode = (String)sessionMap.get("SESSION_SECURITY_CODE");
        if(!serverCode.equals(securityCode)){
            this.addFieldError("checkCode", "验证码错误");
            return;
       }
		User user = userService.validateInfo(model.getName(), DataUtil.md5(model.getPassword()));
		if(user == null) {
			this.addActionError("用户名或密码错误");
		} else {
			sessionMap.put("user", user);
		}
	}

	
	@Override
	public void setSession(Map<String, Object> arg0) {
		sessionMap = arg0;
	}

	public String getSecurityCode() {
		return securityCode;
	}

	public void setSecurityCode(String securityCode) {
		this.securityCode = securityCode;
	}
	
	
}
