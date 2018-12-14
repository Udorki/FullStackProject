package com.kevin.myshop.entity.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kevin.myshop.entity.dao.IClientsDao;
import com.kevin.myshop.entity.models.Clients;

@Service
public class ClientsServiceImplement implements IClientsService {

	@Autowired
	private IClientsDao clientsDao;
	
	@Override
	public List<Clients> findAll() {
		return (List<Clients>) clientsDao.findAll();
	}
	
	@Override
	public Clients findById(long ClientId) {
		return clientsDao.findById(ClientId).get();
	}
	
	@Override
	public void createClient(Clients client) {
		clientsDao.save(client);
	}
	
	@Override
	public void updateClient(Clients client, long ClientId) {
		clientsDao.findById(ClientId).ifPresent((x) -> {
			client.setClient_id(ClientId);
			clientsDao.save(client);
		});
	}
	
	@Override
	public void deleteClient(long ClientId) {
		clientsDao.deleteById(ClientId);
	}
}
