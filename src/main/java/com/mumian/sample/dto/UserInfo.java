package com.mumian.sample.dto;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named("userInfo")
@ApplicationScoped
public class UserInfo {

	/** ユーザ名 */
	private String userName;
	/** パスワード */
	private String password;

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

}
