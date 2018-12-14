package com.kevin.myshop.entity.dao;

import org.springframework.data.repository.CrudRepository;

import com.kevin.myshop.entity.models.Employees;

public interface IEmployeesDao extends CrudRepository<Employees, Long> {

}
