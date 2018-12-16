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

import com.kevin.myshop.entity.models.Categories;
import com.kevin.myshop.entity.services.ICategoriesService;

@CrossOrigin("*")
@RestController
public class CategoriesController {

	@Autowired
	private ICategoriesService categoriesService;
	
	@GetMapping("/category/categories")
	public List<Categories> findAll() {
		return categoriesService.findAll();
	}
	
	@GetMapping("/category/searchCategory/{CategoryId}")
	public Categories findById(@PathVariable(value = "CategoryId") long CategoryId) {
		return categoriesService.findById(CategoryId);
	}
	
	@PostMapping("/category/categoryPos")
	public void createCategory(Categories category) {
		categoriesService.createCategory(category);
	}
	
	@PutMapping("/category/categoryPut/{CategoryId}")
	public void updateCategory(Categories category, @PathVariable(value = "CategoryId") long CategoryId) {
		categoriesService.updateCategory(category, CategoryId);
	}
	
	@DeleteMapping("/category/categoryDel/{CategoryId}")
	public void deleteCategory(Categories category, @PathVariable(value = "CategoryId") long CategoryId) {
		categoriesService.deleteCategory(CategoryId);
	}
}
