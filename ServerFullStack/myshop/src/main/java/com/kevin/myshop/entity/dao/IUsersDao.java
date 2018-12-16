package com.kevin.myshop.entity.dao;

import org.springframework.data.repository.CrudRepository;

import com.kevin.myshop.entity.models.Users;

public interface IUsersDao extends CrudRepository<Users, Long> {
	public Users findUserByUsername(String username);
}
