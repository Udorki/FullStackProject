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

import com.kevin.myshop.entity.models.Repairs;
import com.kevin.myshop.entity.services.IRepairsService;

@CrossOrigin("*")
@RestController
public class RepairsController {

	@Autowired
	private IRepairsService repairsService;
	
	@GetMapping("/repairs")
	public List<Repairs> findAll() {
		return repairsService.findAll();
	}
	
	@GetMapping("/repair/{RepairId}")
	public Repairs findById(@PathVariable(value = "RepairId") long RepairId) {
		return repairsService.findById(RepairId);
	}
	
	@PostMapping("/repairPos")
	public void createRepair(Repairs repair) {
		repairsService.createRepair(repair);
	}
	
	@PutMapping("/repairPut/{RepairId}")
	public void updateRepair(Repairs repair, @PathVariable(value = "RepairId") long RepairId) {
		repairsService.updateRepair(repair, RepairId);
	}
	
	@DeleteMapping("/repairDel/{RepairId}")
	public void deleteRepair(Repairs repair, @PathVariable(value = "RepairId") long RepairId) {
		repairsService.deleteRepair(RepairId);
	}
}
