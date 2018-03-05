package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.pojos.UsuarioVO;


@Repository("UsuarioRepo")
public interface UsuarioRepo extends JpaRepository<UsuarioVO, Integer> {
	
	UsuarioVO findByEmailAndPass(String email,String pass);
	

		
	
	

}
