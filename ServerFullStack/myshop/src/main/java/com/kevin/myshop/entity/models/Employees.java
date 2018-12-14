package com.kevin.myshop.entity.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import org.springframework.web.bind.annotation.CrossOrigin;

@Entity
@Table(name = "employees")
@CrossOrigin("*")
public class Employees implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long employee_id;

	@ManyToOne
	@JoinColumn(name = "role")
	private Roles role;
	
	@NotEmpty
	private String name;
	
	private String surname;
	
	@OneToMany(mappedBy = "employee")
	private List<Repairs> repairs;

	public long getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(long employee_id) {
		this.employee_id = employee_id;
	}

	public Roles getRole() {
		return role;
	}

	public void setRole(Roles role) {
		this.role = role;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Employees(Roles role, @NotEmpty String name, String surname) {
		this.role = role;
		this.name = name;
		this.surname = surname;
	}

	public Employees() {

	}

}
