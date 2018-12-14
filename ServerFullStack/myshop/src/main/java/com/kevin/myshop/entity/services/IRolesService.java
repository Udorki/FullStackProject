package com.kevin.myshop.entity.services;

import java.util.List;

import com.kevin.myshop.entity.models.Roles;

public interface IRolesService {

	public List<Roles> findAll();
	public Roles findById(long RoleId);
	public void createRole(Roles role);
	public void updateRole(Roles role, long RoleId);
	public void deleteRole(long RoleId);
	
}
