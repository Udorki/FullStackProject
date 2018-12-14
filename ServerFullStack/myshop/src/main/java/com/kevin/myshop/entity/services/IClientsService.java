package com.kevin.myshop.entity.services;

import java.util.List;

import com.kevin.myshop.entity.models.Clients;

public interface IClientsService {

	public List<Clients> findAll();
	public Clients findById(long ClientId);
	public void createClient(Clients client);
	public void updateClient(Clients client, long ClientId);
	public void deleteClient(long ClientId);
	
}
