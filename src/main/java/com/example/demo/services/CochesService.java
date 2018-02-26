package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.demo.pojos.CochesVO;
import com.example.demo.repository.CochesRepo;

@Service("CochesService")
@Transactional
public class CochesService {

	@Autowired
	private CochesRepo cochesRepo;
	
	
	
	public List<CochesVO>findAll() {
		return cochesRepo.findAll();
	}
	
	public CochesVO find(Integer idCoches) {
		return cochesRepo.findOne(idCoches);
	}
	
	public void save (CochesVO cochesVO) {
		cochesRepo.save(cochesVO);
	}
	
	public void delete(Integer idCoches) {
		cochesRepo.delete(idCoches);
	}
	
	public void update(Integer idCoches,CochesVO coches) {
		cochesRepo.save(coches);
	}
}
