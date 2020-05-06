package com.springbootbasics.implementation.user;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Type;

@Entity
public class UserPg {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Type(type = "uuid-char")
	private UUID userId;
	@Column(name = "user_name")
	private String name;
	@Column(name = "user_role")
	private String role;

	public UserPg() {
	}

	public UserPg(UUID userId, String name, String role) {
		super();
		this.userId = userId;
		this.name = name;
		this.role = role;
	}

	public UUID getUserId() {
		return userId;
	}

	public String getName() {
		return name;
	}

	public String getRole() {
		return role;
	}

	public void setUserId(UUID userId) {
		this.userId = userId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setRole(String role) {
		this.role = role;
	}


}
