package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.pojos.UsuarioVO;

public interface UsuarioRepo extends JpaRepository<UsuarioVO, Integer> {
	
	

}
