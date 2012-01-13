package com.bzsafety.platform.action;


import com.bzsafety.platform.dao.LoginServiceDao;
import com.opensymphony.xwork2.ActionSupport;


public class LoginAction extends ActionSupport {
	
	private LoginServiceDao loginService;
	private String userName;
	private String password;
	public void setLoginService(LoginServiceDao loginService) {
		this.loginService = loginService;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String execute() throws Exception {
		if(loginService.isLogin(userName, password))
			return SUCCESS;
		else
			return INPUT;
	}
}