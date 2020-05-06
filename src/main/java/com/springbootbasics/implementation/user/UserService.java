package com.springbootbasics.implementation.user;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private UserRepo userRepo;

	public Iterable<UserPg> getUsers() {
		return userRepo.findAll();
	}

	public void addUser(UserPg user) {
		userRepo.save(user);
	}

	public void removeUser(UUID uuid) {
		userRepo.deleteById(uuid);
	}

}
