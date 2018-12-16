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

import com.kevin.myshop.entity.models.Employees;
import com.kevin.myshop.entity.services.IEmployeesService;

@CrossOrigin("*")
@RestController
public class EmployeesController {

	 @Autowired
	 private IEmployeesService employeesService;
	 
	 @GetMapping("/employees")
	 public List<Employees> findAll() {
		 return employeesService.findAll();
	 }
	 
	 @GetMapping("/employee/{EmployeeId}")
	 public Employees findById(@PathVariable(value = "EmployeeId") long EmployeeId) {
		 return employeesService.findById(EmployeeId);
	 }
	 
	 @PostMapping("/employeePos")
	 public void createEmployee(Employees employee) {
		 employeesService.createEmployee(employee);
	 }
	 
	 @PutMapping("/employeePut/{EmployeeId}")
	 public void updateEmployee(Employees employee, @PathVariable(value = "EmployeeId") long EmployeeId) {
		 employeesService.updateEmployee(employee, EmployeeId);
	 }
	 
	 @DeleteMapping("/employeeDel/{EmployeeId}")
	 public void deleteEmployee(Employees employee, @PathVariable(value = "EmployeeId") long EmployeeId) {
		 employeesService.deleteEmployee(EmployeeId);
	 }
}
