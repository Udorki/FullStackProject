package com.kevin.myshop.entity.services;

import java.util.List;

//import com.kevin.myshop.entity.models.Categories;
import com.kevin.myshop.entity.models.Products;

public interface IProductsService {

	public List<Products> findAll();
	public Products findById(long ProductId);
	//public List<Products> findByCategory(Categories category);
	public void createProduct(Products product);
	public void updateProduct(Products product, long ProductId);
	public void deleteProduct(long ProductId);
}
