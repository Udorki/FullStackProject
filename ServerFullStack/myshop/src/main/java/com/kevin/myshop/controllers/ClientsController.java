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

import com.kevin.myshop.entity.models.Clients;
import com.kevin.myshop.entity.services.IClientsService;

@CrossOrigin("*")
@RestController
public class ClientsController {

	@Autowired
	private IClientsService clientsService;
	
	@GetMapping("/clients")
	public List<Clients> findAll() {
		return clientsService.findAll();
	}
	
	@GetMapping("/client/{ClientId}")
	public Clients findById(@PathVariable(value = "ClientId") long ClientId) {
		return clientsService.findById(ClientId);
	}
	
	@PostMapping("/clientPos")
	public void createClient(Clients client) {
		clientsService.createClient(client);
	}
	
	@PutMapping("/clientPut/{ClientId}")
	public void updateClient(Clients client, @PathVariable(value = "ClientId") long ClientId) {
		clientsService.updateClient(client, ClientId);
	}
	
	@DeleteMapping("/clientDel/{ClientId}")
	public void deleteClient(Clients client, @PathVariable(value = "ClientId") long ClientId) {
		clientsService.deleteClient(ClientId);
	}
	
}
