package com.kevin.myshop.entity.services;

import java.util.List;

import com.kevin.myshop.entity.models.Repairs;

public interface IRepairsService {

	public List<Repairs> findAll();
	public Repairs findById(long RepairId);
	public void createRepair(Repairs repair);
	public void updateRepair(Repairs repair, long RepairId);
	public void deleteRepair(long RepairId);
}
