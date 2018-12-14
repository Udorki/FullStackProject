package com.kevin.myshop.entity.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kevin.myshop.entity.dao.IRolesDao;
import com.kevin.myshop.entity.models.Roles;

@Service
public class RolesServiceImplement implements IRolesService {

	@Autowired
	private IRolesDao rolesDao;
	
	@Override
	public List<Roles> findAll() {
		return (List<Roles>) rolesDao.findAll();
	}
	
	@Override
	public Roles findById(long RoleId) {
		return rolesDao.findById(RoleId).get();
	}
	
	@Override
	public void createRole(Roles role) {
		rolesDao.save(role);
	}
	
	@Override
	public void updateRole(Roles role, long RoleId) {
		rolesDao.findById(RoleId).ifPresent((x) -> {
			role.setRole_id(RoleId);
			rolesDao.save(role);
		});
	}
	
	@Override
	public void deleteRole(long RoleId) {
		rolesDao.deleteById(RoleId);
	}
}
