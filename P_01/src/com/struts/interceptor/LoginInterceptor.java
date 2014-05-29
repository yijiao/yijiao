package com.struts.interceptor;

import com.model.User;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import com.struts.BaseAction;
import com.struts.LoginAction;
import com.struts.SecurityCodeImageAction;

public class LoginInterceptor implements Interceptor {

	private static final long serialVersionUID = 4230211839075439660L;

	public void destroy() {
	}

	public void init() {
	}

	public String intercept(ActionInvocation arg0) throws Exception {
		if(arg0.getAction() instanceof LoginAction || arg0.getAction() instanceof SecurityCodeImageAction){
			return arg0.invoke();
		}
		else{
			BaseAction action = (BaseAction) arg0.getAction();
			User user = (User) arg0.getInvocationContext().getSession().get("user");
			if(user == null){
				return "login" ;
			}
			else{
				if(action instanceof UserAware){
					((UserAware)action).setUser(user);
				}
				return arg0.invoke();
			}
		}
	}

}
