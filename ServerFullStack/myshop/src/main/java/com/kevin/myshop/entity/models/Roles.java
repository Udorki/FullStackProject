package com.kevin.myshop.entity.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import org.springframework.web.bind.annotation.CrossOrigin;

@Entity
@Table(name = "roles")
@CrossOrigin("*")
public class Roles implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long role_id;
	
	@NotEmpty
	private String name;
	
	@OneToMany(mappedBy = "role")
	private List<Employees> employees;

	public long getRole_id() {
		return role_id;
	}

	public void setRole_id(long role_id) {
		this.role_id = role_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	public Roles(@NotEmpty String name) {
		this.name = name;
	}

	public Roles() {

	}
	
}
