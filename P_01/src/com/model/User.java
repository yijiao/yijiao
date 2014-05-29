package com.model;

public class User {

	private Integer id;
	private String name;
	private String password;
	private boolean manage;
	private boolean opened;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isManage() {
		return manage;
	}
	public void setManage(boolean manage) {
		this.manage = manage;
	}
	public boolean isOpened() {
		return opened;
	}
	public void setOpened(boolean opened) {
		this.opened = opened;
	}

	
}
