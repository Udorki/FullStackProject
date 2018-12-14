package com.kevin.myshop.entity.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kevin.myshop.entity.dao.IRepairsDao;
import com.kevin.myshop.entity.models.Repairs;

@Service
public class RepairsServiceImplement implements IRepairsService {

	@Autowired
	private IRepairsDao repairsDao;
	
	@Override
	public List<Repairs> findAll() {
		return (List<Repairs>) repairsDao.findAll();
	}
	
	@Override
	public Repairs findById(long RepairId) {
		return repairsDao.findById(RepairId).get();
	}
	
	@Override
	public void createRepair(Repairs repair) {
		repairsDao.save(repair);
	}
	
	@Override
	public void updateRepair(Repairs repair, long RepairId) {
		repairsDao.findById(RepairId).ifPresent((x) -> {
			repair.setRepair_id(RepairId);
			repairsDao.save(repair);
		});
	}
	
	@Override
	public void deleteRepair(long RepairId) {
		repairsDao.deleteById(RepairId);
	}
	
}
