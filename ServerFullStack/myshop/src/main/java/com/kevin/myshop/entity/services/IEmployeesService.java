package com.kevin.myshop.entity.services;

import java.util.List;

import com.kevin.myshop.entity.models.Employees;

public interface IEmployeesService {

	public List<Employees> findAll();
	public Employees findById(long EmployeeId);
	public void createEmployee(Employees employee);
	public void updateEmployee(Employees employee, long EmployeeId);
	public void deleteEmployee(long EmployeeId);
}
