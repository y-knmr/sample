package com.mumian.sample.view;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.mumian.sample.dto.UserInfo;

@Named("loginBean")
@RequestScoped
public class LoginBean {

	@Inject
	UserInfo user;
	
	@PostConstruct
	public void init() {
		System.out.println("called LoginBean#init");
	}
	
	public String login() {
		System.out.println("called LoginBean#login");
	
		System.out.println("userName=" + user.getUserName());
		System.out.println("userPass=" + user.getPassword());
		
		return "/app/menu.xhtml?faces-redirect=true";
	}
	
}
