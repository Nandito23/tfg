package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.pojos.UsuarioVO;


// TODO: Auto-generated Javadoc
/**
 * The Interface UsuarioRepo.
 */
@Repository("UsuarioRepo")
public interface UsuarioRepo extends JpaRepository<UsuarioVO, Integer> {
	
	/**
	 * Find by email and pass.
	 *
	 * @param email the email
	 * @param pass the pass
	 * @return the usuario VO
	 */
	UsuarioVO findByEmailAndPass(String email,String pass);
	

		
	
	

}
