package com.kevin.myshop.entity.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kevin.myshop.entity.dao.IPurchasesDao;
import com.kevin.myshop.entity.models.Purchases;

@Service
public class PurchasesServiceImplement implements IPurchasesService {

	@Autowired
	private IPurchasesDao purchasesDao;
	
	@Override
	public List<Purchases> findAll() {
		return (List<Purchases>) purchasesDao.findAll();
	}
	
	@Override
	public Purchases findById(long PurchaseId) {
		return purchasesDao.findById(PurchaseId).get();
	}
	
	@Override
	public void createPurchase(Purchases purchase) {
		purchasesDao.save(purchase);
	}
	
	@Override
	public void updatePurchase(Purchases purchase, long PurchaseId) {
		purchasesDao.findById(PurchaseId).ifPresent((x) -> {
			purchase.setPurchase_id(PurchaseId);
			purchasesDao.save(purchase);
		});
	}
	
	@Override
	public void deletePurchase(long PurchaseId) {
		purchasesDao.deleteById(PurchaseId);
	}
}
