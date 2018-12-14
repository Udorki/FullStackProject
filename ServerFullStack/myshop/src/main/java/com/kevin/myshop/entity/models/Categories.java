package com.kevin.myshop.entity.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import org.springframework.web.bind.annotation.CrossOrigin;

@Entity
@Table(name = "categories")
@CrossOrigin("*")
public class Categories implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long category_id;
	
	@NotEmpty
	private String name;
	
	@OneToMany(mappedBy = "category")
	private List<Products> products;

	public long getCategory_id() {
		return category_id;
	}

	public void setCategory_id(long category_id) {
		this.category_id = category_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Categories(@NotEmpty String name) {
		this.name = name;
	}

	public Categories() {

	}
	
}
