package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.demo.pojos.ReservasVO;
import com.example.demo.repository.ReservasRepo;

/**
 * The Class ReservasService.
 */
@Service("ReservasService")
@Transactional
public class ReservasService {

	/** The reservas repo. */
	@Autowired
	private ReservasRepo reservasRepo;
	
	/**
	 * Find all.
	 *
	 * @return the list
	 */
	public List<ReservasVO>findAll() {
		return reservasRepo.findAll();
	}
	
	/**
	 * Find.
	 *
	 * @param idReserva the id reserva
	 * @return the reservas VO
	 */
	public ReservasVO find(Integer idReserva) {
		return reservasRepo.findOne(idReserva);
	}
	
	/**
	 * Save.
	 *
	 * @param reservasVO the reservas VO
	 */
	public void save (ReservasVO reservasVO) {
		reservasRepo.save(reservasVO);
	}
	
	/**
	 * Delete.
	 *
	 * @param idReserva the id reserva
	 */
	public void delete(Integer idReserva) {
		reservasRepo.delete(idReserva);
	}
	
	/**
	 * Update.
	 *
	 * @param idReserva the id reserva
	 * @param reserva the reserva
	 */
	public void update(Integer idReserva,ReservasVO reserva) {
		reservasRepo.save(reserva);
	}
}
