package com.kevin.myshop.entity.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import org.springframework.web.bind.annotation.CrossOrigin;

@Entity
@Table(name = "repairs")
@CrossOrigin("*")
public class Repairs implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long repair_id;
	
	@ManyToOne
	@JoinColumn(name = "employee")
	private Employees employee;
	
	@ManyToOne
	@JoinColumn(name = "client")
	private Clients client;
	
	@NotEmpty
	private String product;
	
	@NotEmpty
	private String problem;
	
	@NotEmpty
	private String status;

	public long getRepair_id() {
		return repair_id;
	}

	public void setRepair_id(long repair_id) {
		this.repair_id = repair_id;
	}

	public Employees getEmployee() {
		return employee;
	}

	public void setEmployee(Employees employee) {
		this.employee = employee;
	}

	public Clients getClient() {
		return client;
	}

	public void setClient(Clients client) {
		this.client = client;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getProblem() {
		return problem;
	}

	public void setProblem(String problem) {
		this.problem = problem;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Repairs(Employees employee, Clients client, @NotEmpty String product, @NotEmpty String problem,
			@NotEmpty String status) {
		this.employee = employee;
		this.client = client;
		this.product = product;
		this.problem = problem;
		this.status = status;
	}

	public Repairs() {

	}
	
}
