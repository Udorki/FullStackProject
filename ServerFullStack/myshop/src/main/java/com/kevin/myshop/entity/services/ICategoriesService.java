package com.kevin.myshop.entity.services;

import java.util.List;

import com.kevin.myshop.entity.models.Categories;

public interface ICategoriesService {

	public List<Categories> findAll();
	public Categories findById(long CategoryId);
	public void createCategory(Categories category);
	public void updateCategory(Categories category, long CategoryId);
	public void deleteCategory(long CategoryId);
}
