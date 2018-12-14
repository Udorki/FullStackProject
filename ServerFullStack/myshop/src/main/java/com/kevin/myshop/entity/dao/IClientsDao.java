package com.kevin.myshop.entity.dao;

import org.springframework.data.repository.CrudRepository;

import com.kevin.myshop.entity.models.Clients;

public interface IClientsDao extends CrudRepository<Clients, Long> {

}
