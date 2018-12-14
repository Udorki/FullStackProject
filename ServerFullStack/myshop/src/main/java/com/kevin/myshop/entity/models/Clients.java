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
@Table(name = "clients")
@CrossOrigin("*")
public class Clients implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long client_id;
	
	@NotEmpty
	private String name;
	
	private String surnames;
	
	 @NotEmpty
	 private String dni;
	 
	 @NotEmpty
	 private String address;
	 
	 @NotEmpty
	 private String email;
	 
	 private String mobile_number;
	 
	 @OneToMany(mappedBy = "client")
	 private List<Purchases> purchases;
	 
	 @OneToMany(mappedBy = "client")
	 private List<Repairs> repairs;
	 
	 @OneToMany(mappedBy = "client")
	 private List<Users> users;

	public long getClient_id() {
		return client_id;
	}

	public void setClient_id(long client_id) {
		this.client_id = client_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurnames() {
		return surnames;
	}

	public void setSurnames(String surnames) {
		this.surnames = surnames;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile_number() {
		return mobile_number;
	}

	public void setMobile_number(String mobile_number) {
		this.mobile_number = mobile_number;
	}

	public Clients(@NotEmpty String name, String surnames, @NotEmpty String dni,
			@NotEmpty String address, @NotEmpty String email, String mobile_number) {
		this.name = name;
		this.surnames = surnames;
		this.dni = dni;
		this.address = address;
		this.email = email;
		this.mobile_number = mobile_number;
	}

	public Clients() {

	}
	 
}
