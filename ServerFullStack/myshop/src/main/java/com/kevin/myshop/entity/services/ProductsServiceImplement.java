package com.kevin.myshop.entity.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kevin.myshop.entity.dao.IProductsDao;
//import com.kevin.myshop.entity.models.Categories;
import com.kevin.myshop.entity.models.Products;

@Service
public class ProductsServiceImplement implements IProductsService {

	@Autowired
	private IProductsDao productsDao;
	
	@Override
	public List<Products> findAll() {
		return (List<Products>) productsDao.findAll();
	}
	
	@Override
	public Products findById(long ProductId) {
		return productsDao.findById(ProductId).get();
	}
	
	/*@Override
	public List<Products> findByCategory(Categories category) {
		return (List<Products>) productsDao.findByCategory(category);
	}*/
	
	@Override
	public void createProduct(Products product) {
		productsDao.save(product);
	}
	
	@Override
	public void updateProduct(Products product, long ProductId) {
		productsDao.findById(ProductId).ifPresent((x) -> {
			product.setProduct_id(ProductId);
			productsDao.save(product);
		});
	}
	
	@Override
	public void deleteProduct(long ProductId) {
		productsDao.deleteById(ProductId);
	}
}
