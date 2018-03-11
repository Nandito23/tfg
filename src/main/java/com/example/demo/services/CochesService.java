package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.demo.pojos.CochesVO;
import com.example.demo.repository.CochesRepo;

/**
 * The Class CochesService.
 */
@Service("CochesService")
@Transactional
public class CochesService {

	/** The coches repo. */
	@Autowired
	private CochesRepo cochesRepo;
	
	
	
	/**
	 * Find all.
	 *
	 * @return the list
	 */
	public List<CochesVO>findAll() {
		return cochesRepo.findAll();
	}
	
	/**
	 * Find.
	 *
	 * @param idCoches the id coches
	 * @return the coches VO
	 */
	public CochesVO find(Integer idCoches) {
		return cochesRepo.findOne(idCoches);
	}
	
	/**
	 * Save.
	 *
	 * @param cochesVO the coches VO
	 */
	public void save (CochesVO cochesVO) {
		cochesRepo.save(cochesVO);
	}
	
	/**
	 * Delete.
	 *
	 * @param idCoches the id coches
	 */
	public void delete(Integer idCoches) {
		cochesRepo.delete(idCoches);
	}
	
	/**
	 * Update.
	 *
	 * @param idCoches the id coches
	 * @param coches the coches
	 */
	public void update(Integer idCoches,CochesVO coches) {
		cochesRepo.save(coches);
	}
}
