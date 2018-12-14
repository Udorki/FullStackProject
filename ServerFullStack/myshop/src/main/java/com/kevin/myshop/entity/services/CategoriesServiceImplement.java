package com.kevin.myshop.entity.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kevin.myshop.entity.dao.ICategoriesDao;
import com.kevin.myshop.entity.models.Categories;

@Service
public class CategoriesServiceImplement implements ICategoriesService{

	@Autowired
	private ICategoriesDao categoriesDao;
	
	@Override
	public List<Categories> findAll() {
		return (List<Categories>) categoriesDao.findAll();
	}
	
	@Override
	public Categories findById(long CategoryId) {
		return categoriesDao.findById(CategoryId).get();
	}
	
	@Override
	public void createCategory(Categories category) {
		categoriesDao.save(category);
	}
	
	@Override
	public void updateCategory(Categories category, long CategoryId) {
		categoriesDao.findById(CategoryId).ifPresent((x) -> {
			category.setCategory_id(CategoryId);
			categoriesDao.save(category);
		});
	}
	
	@Override
	public void deleteCategory(long CategoryId) {
		categoriesDao.deleteById(CategoryId);
	}
}
