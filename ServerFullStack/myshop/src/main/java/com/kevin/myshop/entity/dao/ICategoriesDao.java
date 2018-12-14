package com.kevin.myshop.entity.dao;

import org.springframework.data.repository.CrudRepository;

import com.kevin.myshop.entity.models.Categories;

public interface ICategoriesDao extends CrudRepository<Categories, Long>{

}
