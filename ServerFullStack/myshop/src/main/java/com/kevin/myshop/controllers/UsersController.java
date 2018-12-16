package com.kevin.myshop.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kevin.myshop.entity.models.Users;
import com.kevin.myshop.entity.services.IUsersService;

@CrossOrigin("*")
@RestController
public class UsersController {

	@Autowired
	private IUsersService usersService;
	
	@GetMapping("/user/users")
	public List<Users> findAll() {
		return usersService.findAll();
	}
	
	@GetMapping("/user/searchUser/{UserId}")
	public Users findById(@PathVariable(value = "UserId") long UserId) {
		return usersService.findById(UserId);
	}
	
	@PostMapping("/user/userPos")
	public void createUser(Users user) {
		usersService.createUser(user);
	}
	
	@PutMapping("/user/userPut/{UserId}")
	public void updateUser(Users user, @PathVariable(value = "UserId") long UserId) {
		usersService.updateUser(user, UserId);
	}
	
	@DeleteMapping("/user/userDel/{UserId}")
	public void deleteUser(Users user, @PathVariable(value = "UserId") long UserId) {
		usersService.deleteUser(UserId);
	}
}
