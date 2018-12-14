package com.kevin.myshop.entity.dao;

//import java.util.List;

import org.springframework.data.repository.CrudRepository;

//import com.kevin.myshop.entity.models.Categories;
import com.kevin.myshop.entity.models.Products;

public interface IProductsDao extends CrudRepository<Products, Long> {

	//List<Products> findByCategory(Categories category);

}
