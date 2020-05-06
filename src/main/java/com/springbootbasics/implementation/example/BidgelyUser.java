package com.springbootbasics.implementation.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BidgelyUser {

	private String name;
	private String email;

	public BidgelyUser(String userName, String userEmail) {
		this.name = userName;
		this.email = userEmail;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-example.xml");
		BidgelyUser user = context.getBean(BidgelyUser.class);
		System.out.println(user.getName());
		System.out.println(user.getEmail());
	}

}
