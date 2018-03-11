package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.demo.pojos.GarajeVO;
import com.example.demo.repository.GarajeRepo;

/**
 * The Class GarajeService.
 */
@Service("GarajeService")
@Transactional
public class GarajeService {

	/** The garaje repo. */
	@Autowired
	private GarajeRepo garajeRepo;
	
	/**
	 * Find all.
	 *
	 * @return the list
	 */
	public List<GarajeVO>findAll() {
		return garajeRepo.findAll();
	}
	
	/**
	 * Find.
	 *
	 * @param idGaraje the id garaje
	 * @return the garaje VO
	 */
	public GarajeVO find(Integer idGaraje) {
		return garajeRepo.findOne(idGaraje);
	}
	
	/**
	 * Save.
	 *
	 * @param garajeVO the garaje VO
	 */
	public void save (GarajeVO garajeVO) {
		garajeRepo.save(garajeVO);
	}
	
	/**
	 * Delete.
	 *
	 * @param idGaraje the id garaje
	 */
	public void delete(Integer idGaraje) {
		garajeRepo.delete(idGaraje);
	}
	
	/**
	 * Update.
	 *
	 * @param idGaraje the id garaje
	 * @param garaje the garaje
	 */
	public void update(Integer idGaraje,GarajeVO garaje) {
		garajeRepo.save(garaje);
	}
}
