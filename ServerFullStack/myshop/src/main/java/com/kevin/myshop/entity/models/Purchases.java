package com.kevin.myshop.entity.models;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.web.bind.annotation.CrossOrigin;

@Entity
@Table(name = "purchases")
@CrossOrigin("*")
public class Purchases implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long purchase_id;
	
	@ManyToOne
	@JoinColumn(name = "client")
	private Clients client;
	
	@NotNull
	private int products_quantity;
	
	@NotEmpty
	private String status;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinTable(name = "products_purchased", joinColumns = { @JoinColumn (name = "purchase_id") }, inverseJoinColumns = { @JoinColumn(name = "product_id") })
	private Set<Products> products;

	public long getPurchase_id() {
		return purchase_id;
	}

	public void setPurchase_id(long purchase_id) {
		this.purchase_id = purchase_id;
	}

	public Clients getClient() {
		return client;
	}

	public void setClient(Clients client) {
		this.client = client;
	}

	public int getProducts_quantity() {
		return products_quantity;
	}

	public void setProducts_quantity(int products_quantity) {
		this.products_quantity = products_quantity;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Set<Products> getProducts() {
		return products;
	}

	public void setProducts(Set<Products> products) {
		this.products = products;
	}

	public Purchases(Clients client, @NotNull int products_quantity, @NotEmpty String status) {
		this.client = client;
		this.products_quantity = products_quantity;
		this.status = status;
	}

	public Purchases() {

	}
	
}
