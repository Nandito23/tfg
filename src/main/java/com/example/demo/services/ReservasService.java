package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.demo.pojos.ReservasVO;
import com.example.demo.repository.ReservasRepo;

@Service("ReservasService")
@Transactional
public class ReservasService {

	@Autowired
	private ReservasRepo reservasRepo;
	
	public List<ReservasVO>findAll() {
		return reservasRepo.findAll();
	}
	
	public ReservasVO find(Integer idReserva) {
		return reservasRepo.findOne(idReserva);
	}
	
	public void save (ReservasVO reservasVO) {
		reservasRepo.save(reservasVO);
	}
	
	public void delete(Integer idReserva) {
		reservasRepo.delete(idReserva);
	}
	
	public void update(Integer idReserva,ReservasVO reserva) {
		reservasRepo.save(reserva);
	}
}
