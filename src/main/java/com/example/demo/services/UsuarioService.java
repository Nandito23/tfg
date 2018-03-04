package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.demo.pojos.UsuarioVO;
import com.example.demo.repository.UsuarioRepo;

@Service("UsuarioService")
@Transactional
public class UsuarioService {

	@Autowired
	private UsuarioRepo usuarioRepo;
	
	public List<UsuarioVO>findAll() {
		return usuarioRepo.findAll();
	}
	
	public UsuarioVO find(Integer idUsuario) {
		return usuarioRepo.findOne(idUsuario);
	}
	
	public void save (UsuarioVO usuarioVO) {
		usuarioRepo.save(usuarioVO);
	}
	
	public void delete(Integer idUsuario) {
		usuarioRepo.delete(idUsuario);
	}
	
	public void update(Integer idUsuario,UsuarioVO usuario) {
		usuarioRepo.save(usuario);
	}

	//VALIDACIÓN DE EMAIL Y PASS DE LOGIN
	public 	UsuarioVO ValidarLogin(String email,String pass) {
		return usuarioRepo.findByEmailAndPass(email, pass);
	}
	
}
