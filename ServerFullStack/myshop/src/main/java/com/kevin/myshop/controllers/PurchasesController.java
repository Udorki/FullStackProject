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

import com.kevin.myshop.entity.models.Purchases;
import com.kevin.myshop.entity.services.IPurchasesService;

@CrossOrigin("*")
@RestController
public class PurchasesController {

	@Autowired
	private IPurchasesService purchasesService;
	
	@GetMapping("/purchase/purchases")
	public List<Purchases> findAll() {
		return purchasesService.findAll();
	}
	
	@GetMapping("/purchase/searchPurchase/{PurchaseId}")
	public Purchases findById(@PathVariable(value = "PurchaseId") long PurchaseId) {
		return purchasesService.findById(PurchaseId);
	}
	
	@PostMapping("/purchase/purchasePos")
	public void createPurchase(Purchases purchase) {
		purchasesService.createPurchase(purchase);
	}
	
	@PutMapping("/purchase/purchasePut/{PurchaseId}")
	public void updatePurchase(Purchases purchase, @PathVariable(value = "PurchaseId") long PurchaseId) {
		purchasesService.updatePurchase(purchase, PurchaseId);
	}
	
	@DeleteMapping("/purchase/purchaseDel/{PurchaseId}")
	public void deletePurchase(Purchases purchase, @PathVariable(value = "PurchaseId") long PurchaseId) {
		purchasesService.deletePurchase(PurchaseId);
	}
	
}
