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

import com.kevin.myshop.entity.models.Roles;
import com.kevin.myshop.entity.services.IRolesService;

@CrossOrigin("*")
@RestController
public class RolesController {

	@Autowired
	private IRolesService rolesService;
	
	@GetMapping("/role/roles")
	public List<Roles> findAll() {
		return rolesService.findAll();
	}
	
	@GetMapping("/role/searchRole/{RoleId}")
	public Roles findById(@PathVariable(value = "RoleId") long RoleId) {
		return rolesService.findById(RoleId);
	}
	
	@PostMapping("/role/rolePos")
	public void createRole(Roles role) {
		rolesService.createRole(role);
	}
	
	@PutMapping("/role/rolePut/{RoleId}")
	public void updateRole(Roles role, @PathVariable(value = "RoleId") long RoleId) {
		rolesService.updateRole(role, RoleId);
	}
	
	@DeleteMapping("/role/roleDel/{RoleId}")
	public void deleteRole(Roles role, @PathVariable(value = "RoleId") long RoleId) {
		rolesService.deleteRole(RoleId);
	}
	
}
