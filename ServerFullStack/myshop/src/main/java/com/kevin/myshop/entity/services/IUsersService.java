package com.kevin.myshop.entity.services;

import java.util.List;

import com.kevin.myshop.entity.models.Users;

public interface IUsersService {

	public List<Users> findAll();
	public Users findById(long UserId);
	public void createUser(Users user);
	public void updateUser(Users user, long UserId);
	public void deleteUser(long UserId);
}
