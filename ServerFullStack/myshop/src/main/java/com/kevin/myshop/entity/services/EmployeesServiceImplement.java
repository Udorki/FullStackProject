package com.kevin.myshop.entity.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kevin.myshop.entity.dao.IEmployeesDao;
import com.kevin.myshop.entity.models.Employees;

@Service
public class EmployeesServiceImplement implements IEmployeesService {

	@Autowired
	private IEmployeesDao employeesDao;
	
	@Override
	public List<Employees> findAll() {
		return (List<Employees>) employeesDao.findAll();
	}
	
	@Override
	public Employees findById(long EmployeeId) {
		return employeesDao.findById(EmployeeId).get();
	}
	
	@Override
	public void createEmployee(Employees employee) {
		employeesDao.save(employee);
	}
	
	@Override
	public void updateEmployee(Employees employee, long EmployeeId) {
		employeesDao.findById(EmployeeId).ifPresent((x) -> {
			employee.setEmployee_id(EmployeeId);
			employeesDao.save(employee);
		});
	}
	
	@Override
	public void deleteEmployee(long EmployeeId) {
		employeesDao.deleteById(EmployeeId);
	}
}
