package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.demo.pojos.GarajeVO;
import com.example.demo.repository.GarajeRepo;

@Service("GarajeService")
@Transactional
public class GarajeService {

	@Autowired
	private GarajeRepo garajeRepo;
	
	public List<GarajeVO>findAll() {
		return garajeRepo.findAll();
	}
	
	public GarajeVO find(Integer idGaraje) {
		return garajeRepo.findOne(idGaraje);
	}
	
	public void save (GarajeVO garajeVO) {
		garajeRepo.save(garajeVO);
	}
	
	public void delete(Integer idGaraje) {
		garajeRepo.delete(idGaraje);
	}
	
	public void update(Integer idGaraje,GarajeVO garaje) {
		garajeRepo.save(garaje);
	}
}
