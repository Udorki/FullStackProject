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

//import com.kevin.myshop.entity.models.Categories;
import com.kevin.myshop.entity.models.Products;
import com.kevin.myshop.entity.services.IProductsService;

@CrossOrigin( origins = {"*","*"})
@RestController
public class ProductsController {

	@Autowired
	private IProductsService productsService;
	
	@GetMapping("/product/products")
	public List<Products> findAll() {
		return productsService.findAll();
	}
	
	@GetMapping("/product/searchProduct/{ProductId}")
	public Products findById(@PathVariable(value = "ProductId") long ProductId) {
		return productsService.findById(ProductId);
	}
	
	/*@GetMapping("/productCat/{Category}")
	public List<Products> findByCategory(@PathVariable(value = "category") Categories category) {
		return productsService.findByCategory(category);
	}*/
	
	@PostMapping("/product/productPos")
	public void createProduct(Products product) {
		productsService.createProduct(product);
	}
	
	@PutMapping("/product/productPut/{ProductId}")
	public void updateProduct(Products product, @PathVariable(value = "ProductId") long ProductId) {
		productsService.updateProduct(product, ProductId);
	}
	
	@DeleteMapping("/product/productDel/{ProductId}")
	public void deleteProduct(Products product, @PathVariable(value = "ProductId") long ProductId) {
		productsService.deleteProduct(ProductId);
	}
	
}
