package com.kevin.myshop.entity.dao;

import org.springframework.data.repository.CrudRepository;

import com.kevin.myshop.entity.models.Purchases;

public interface IPurchasesDao extends CrudRepository<Purchases, Long> {

}
