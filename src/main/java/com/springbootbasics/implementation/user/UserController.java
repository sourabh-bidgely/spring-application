package com.springbootbasics.implementation.user;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/users")
	public Iterable<UserPg> getUsers() {
		System.out.println("Trying to get users");
		return userService.getUsers();
	}

	@PostMapping("/users")
	public void addUsers(@RequestBody UserPg user) {
		userService.addUser(user);
	}

	@DeleteMapping("/user/{userId}")
	public void deleteUser(@PathVariable UUID userId) {
		userService.removeUser(userId);

	}
}
