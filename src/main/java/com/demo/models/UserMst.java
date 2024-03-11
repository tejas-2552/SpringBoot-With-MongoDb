package com.demo.models;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "userMst")
public class UserMst {

	private Integer id;
	private String userName;
	private String userPassword;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public UserMst(Integer id, String userName, String userPassword) {
		super();
		this.id = id;
		this.userName = userName;
		this.userPassword = userPassword;
	}
	@Override
	public String toString() {
		return "UserMst [id=" + id + ", userName=" + userName + ", userPassword=" + userPassword + "]";
	}
	
	
	
}
