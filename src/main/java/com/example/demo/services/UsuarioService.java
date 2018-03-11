package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.demo.pojos.UsuarioVO;
import com.example.demo.repository.UsuarioRepo;

/**
 * The Class UsuarioService.
 */
@Service("UsuarioService")
@Transactional
public class UsuarioService {

	/** The usuario repo. */
	@Autowired
	private UsuarioRepo usuarioRepo;
	
	/**
	 * Find all.
	 *
	 * @return the list
	 */
	public List<UsuarioVO>findAll() {
		return usuarioRepo.findAll();
	}
	
	/**
	 * Find.
	 *
	 * @param idUsuario the id usuario
	 * @return the usuario VO
	 */
	public UsuarioVO find(Integer idUsuario) {
		return usuarioRepo.findOne(idUsuario);
	}
	
	/**
	 * Save.
	 *
	 * @param usuarioVO the usuario VO
	 */
	public void save (UsuarioVO usuarioVO) {
		usuarioRepo.save(usuarioVO);
	}
	
	/**
	 * Delete.
	 *
	 * @param idUsuario the id usuario
	 */
	public void delete(Integer idUsuario) {
		usuarioRepo.delete(idUsuario);
	}
	
	/**
	 * Update.
	 *
	 * @param idUsuario the id usuario
	 * @param usuario the usuario
	 */
	public void update(Integer idUsuario,UsuarioVO usuario) {
		usuarioRepo.save(usuario);
	}

	/**
	 * Validar login.
	 *
	 * @param email the email
	 * @param pass the pass
	 * @return the usuario VO
	 */
	//VALIDACIÓN DE EMAIL Y PASS DE LOGIN
	public 	UsuarioVO ValidarLogin(String email,String pass) {
		return usuarioRepo.findByEmailAndPass(email, pass);
	}
	
}
