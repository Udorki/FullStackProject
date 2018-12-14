package com.kevin.myshop.entity.services;

import java.util.List;

import com.kevin.myshop.entity.models.Purchases;

public interface IPurchasesService {

	public List<Purchases> findAll();
	public Purchases findById(long PurchaseId);
	public void createPurchase(Purchases purchase);
	public void updatePurchase(Purchases purchase, long PurchaseId);
	public void deletePurchase(long PurchaseId);
}
