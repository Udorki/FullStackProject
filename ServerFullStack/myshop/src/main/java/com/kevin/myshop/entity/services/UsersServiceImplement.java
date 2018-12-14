package com.kevin.myshop.entity.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kevin.myshop.entity.dao.IUsersDao;
import com.kevin.myshop.entity.models.Users;

@Service
public class UsersServiceImplement implements IUsersService {

	@Autowired
	private IUsersDao usersDao;
	
	@Override
	public List<Users> findAll() {
		return (List<Users>) usersDao.findAll();
	}
	
	@Override
	public Users findById(long UserId) {
		return usersDao.findById(UserId).get();
	}
	
	@Override
	public void createUser(Users user) {
		usersDao.save(user);
	}
	
	@Override
	public void updateUser(Users user, long UserId) {
		usersDao.findById(UserId).ifPresent((x) -> {
			user.setUser_id(UserId);
			usersDao.save(user);
		});
	}
	
	@Override
	public void deleteUser(long UserId) {
		usersDao.deleteById(UserId);
	}
}
